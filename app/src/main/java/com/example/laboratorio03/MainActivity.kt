package com.example.laboratorio03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        birthdayButton.setOnClickListener {
            val intent = Intent(this@MainActivity, BirthdayCardActivity::class.java)
            startActivity(intent)
        }

        val birthdayButton = findViewById<Button>(R.id.birthdayButton)
        birthdayButton.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BirthdayCardDesignFragments())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }
}

