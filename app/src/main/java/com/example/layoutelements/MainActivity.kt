package com.example.layoutelements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.children

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toGame = findViewById<Button>(R.id.play)
        val linearLayout = findViewById<LinearLayout>(R.id.ll)
        val radioGroup = findViewById<RadioGroup>(R.id.rg)
        toGame.setOnClickListener {

        }

    }
}