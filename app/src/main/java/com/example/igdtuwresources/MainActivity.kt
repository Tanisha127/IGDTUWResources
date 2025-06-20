package com.example.igdtuwresources

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up branch selection buttons
        setupBranchButton(R.id.btnCSEAI, "CSE AI")
        setupBranchButton(R.id.btnCSE, "CSE")
        setupBranchButton(R.id.btnECEAI, "ECE AI")
        setupBranchButton(R.id.btnECE, "ECE")
        setupBranchButton(R.id.btnIT, "IT")
        setupBranchButton(R.id.btnAIML, "AIML")
        setupBranchButton(R.id.btnMAE, "MAE")
    }

    // Function to handle opening the Semester Selection screen
    private fun setupBranchButton(buttonId: Int, branchName: String) {
        findViewById<Button>(buttonId).setOnClickListener {
            openSemesterSelection(branchName)
        }
    }

    private fun openSemesterSelection(branch: String) {
        val intent = Intent(this, SemesterSelectionActivity::class.java)
        intent.putExtra("branch", branch)
        startActivity(intent)
    }
}
