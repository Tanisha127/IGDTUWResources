package com.example.igdtuwresources

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ECEAI7thSemSubjectsActivity : AppCompatActivity() {

    private lateinit var subjectHeader: TextView
    private lateinit var subjectListView: ListView
    private lateinit var backArrow: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eceai_7th_sem_subjects)

        // Initialize views
        subjectHeader = findViewById(R.id.subjectHeader)
        subjectListView = findViewById(R.id.listSubjects)
        backArrow = findViewById(R.id.backArrow)

        // Set the header text
        subjectHeader.text = "Subjects for Semester 7 (ECEAI)"

        // Handle back arrow
        backArrow.setOnClickListener {
            finish()
        }

        // Subject list
        val subjects = listOf(
            ""
        )

        // Set up ListView adapter with custom styling
        val adapter = object : ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            subjects
        ) {
            override fun getView(position: Int, convertView: android.view.View?, parent: android.view.ViewGroup): android.view.View {
                val view = super.getView(position, convertView, parent)
                val textView = view.findViewById<TextView>(android.R.id.text1)
                textView.setTextColor(0xFF000000.toInt()) // black text
                textView.textSize = 25f
                textView.setPadding(48, 40, 48, 40)
                textView.setBackgroundResource(R.drawable.subject_item_bg)
                return view
            }
        }

        subjectListView.adapter = adapter

        // Click listener opens SubjectUnitsActivity with subject name
        subjectListView.setOnItemClickListener { _, _, position, _ ->
            val subject = subjects[position]
            val intent = Intent(this, SubjectUnitsActivity::class.java)
            intent.putExtra("branch", "ECEAI")
            intent.putExtra("semester", "7th")
            intent.putExtra("subjectName", subject)
            startActivity(intent)
        }
    }
}
