package com.example.igdtuwresources

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject
import java.nio.charset.Charset

class SubjectUnitsActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var header: TextView
    private lateinit var backArrow: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_units)

        listView = findViewById(R.id.unitList)
        header = findViewById(R.id.subjectTitle)
        backArrow = findViewById(R.id.backArrow)

        // Get data passed from previous screen
        val branch = intent.getStringExtra("branch")?.lowercase() ?: return
        val semester = intent.getStringExtra("semester")?.lowercase() ?: return
        val subject = intent.getStringExtra("subjectName") ?: return

        header.text = "$subject Notes"

        backArrow.setOnClickListener { finish() }

        val unitLinks = loadUnitLinks(branch, semester, subject)
        val units = unitLinks.keys.toList()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, units)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val unitName = units[position]
            val url = unitLinks[unitName]
            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            } else {
                Toast.makeText(this, "Link not available", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loadUnitLinks(branch: String, semester: String, subject: String): Map<String, String> {
        val filename = "${branch}_${semester}_sem_units.json"
        val jsonStr = assets.open(filename).bufferedReader(Charset.forName("UTF-8")).use { it.readText() }
        val json = JSONObject(jsonStr)
        val subjectJson = json.getJSONObject(subject)

        val map = mutableMapOf<String, String>()
        val keys = subjectJson.keys()
        while (keys.hasNext()) {
            val key = keys.next()
            map[key] = subjectJson.getString(key)
        }
        return map
    }
}
