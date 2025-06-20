package com.example.igdtuwresources

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SemesterSelectionActivity : AppCompatActivity() {

    private lateinit var branchName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester_selection)

        // Get branch from intent
        branchName = intent.getStringExtra("branch") ?: "Unknown"

        // Update header text
        val headerText = findViewById<TextView>(R.id.semesterHeader)
        headerText.text = "Choose Your Semester ($branchName)"

        // Show confirmation toast
        Toast.makeText(this, "Selected: $branchName", Toast.LENGTH_SHORT).show()

        // Back arrow functionality
        findViewById<ImageView>(R.id.backArrow).setOnClickListener {
            finish()
        }

        val sem1Button = findViewById<Button>(R.id.sem1Button)
        val sem2Button = findViewById<Button>(R.id.sem2Button)
        val sem3Button = findViewById<Button>(R.id.sem3Button)
        val sem4Button = findViewById<Button>(R.id.sem4Button)
        val sem5Button = findViewById<Button>(R.id.sem5Button)
        val sem6Button = findViewById<Button>(R.id.sem6Button)
        val sem7Button = findViewById<Button>(R.id.sem7Button)
        val sem8Button = findViewById<Button>(R.id.sem8Button)


        sem1Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE1stSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI1stSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI1stSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE1stSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE1stSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML1stSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT1stSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 1st semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }

        sem2Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE2ndSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI2ndSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI2ndSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE2ndSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE2ndSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML2ndSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT2ndSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 2nd semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }
        sem3Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE3rdSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI3rdSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI3rdSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE3rdSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE3rdSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML3rdSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT3rdSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 3rd semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }
        sem4Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE4thSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI4thSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI4thSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE4thSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE4thSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML4thSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT4thSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 4th semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }
        sem5Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE5thSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI5thSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI5thSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE5thSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE5thSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML5thSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT5thSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 5th semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }
        sem6Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE6thSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI6thSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI6thSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE6thSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE6thSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML6thSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT6thSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 6th semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }
        sem7Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE7thSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI7thSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI7thSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE7thSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE7thSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML7thSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT7thSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 7th semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }
        sem8Button.setOnClickListener {
            when (branchName) {
                "CSE" -> startActivity(Intent(this, CSE8thSemSubjectsActivity::class.java))
                "CSE AI" -> startActivity(Intent(this, CSEAI8thSemSubjectsActivity::class.java))
                "ECE AI" -> startActivity(Intent(this, ECEAI8thSemSubjectsActivity::class.java))
                "ECE" -> startActivity(Intent(this, ECE8thSemSubjectsActivity::class.java))
                "MAE" -> startActivity(Intent(this, MAE8thSemSubjectsActivity::class.java))
                "AIML" -> startActivity(Intent(this, AIML8thSemSubjectsActivity::class.java))
                "IT" -> startActivity(Intent(this, IT8thSemSubjectsActivity::class.java))
                else -> Toast.makeText(this, "Subjects for $branchName 8th semester not available yet", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
