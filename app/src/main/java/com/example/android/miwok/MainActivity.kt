package com.example.android.miwok

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the View that shows the numbers category
        val numbers = findViewById<View>(R.id.numbers) as TextView

// Set a click listener on that View
        numbers.setOnClickListener {
            val numbersIntent = Intent(this@MainActivity, NumbersActivity::class.java)
            startActivity(numbersIntent)
        }

        // Find the View that shows the numbers category
        val family = findViewById<View>(R.id.family) as TextView

// Set a click listener on that View
        family.setOnClickListener {
            val familyIntent = Intent(this@MainActivity, FamilyActivity::class.java)
            startActivity(familyIntent)
        }

        // Find the View that shows the numbers category
        val colors = findViewById<View>(R.id.colors) as TextView

// Set a click listener on that View
        colors.setOnClickListener {
            val colorsIntent = Intent(this@MainActivity, ColorsActivity::class.java)
            startActivity(colorsIntent)
        }

        // Find the View that shows the numbers category
        val phrases = findViewById<View>(R.id.phrases) as TextView

// Set a click listener on that View
        phrases.setOnClickListener {
            val phrasesIntent = Intent(this@MainActivity, PhrasesActivity::class.java)
            startActivity(phrasesIntent)
        }

    }

}