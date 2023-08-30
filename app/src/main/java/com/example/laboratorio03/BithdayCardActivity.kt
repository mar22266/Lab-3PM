package com.example.laboratorio03


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class BirthdayCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)

        // Mostrar el fragment BirthdayCardDesignFragment
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, BirthdayCardDesignFragments())
                .commit()
        }
    }
}
