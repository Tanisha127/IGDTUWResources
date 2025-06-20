package com.example.igdtuwresources

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BranchDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val branchName = intent.getStringExtra("branch_name") ?: "Unknown"
        val branchColorHex = intent.getStringExtra("branch_color") ?: "#000000"

        val layout = LinearLayout(this).apply {
            setBackgroundColor(Color.parseColor(branchColorHex))
            orientation = LinearLayout.VERTICAL
            setPadding(50, 50, 50, 50)
        }

        val textView = TextView(this).apply {
            text = "Welcome to $branchName branch"
            textSize = 24f
            setTextColor(Color.WHITE)
        }

        layout.addView(textView)

        setContentView(layout)
    }
}
