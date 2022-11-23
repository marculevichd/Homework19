package com.example.homework19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radio_btn1 = findViewById<RadioButton>(R.id.radio_btn1)
        val radio_btn2 = findViewById<RadioButton>(R.id.radio_btn2)
        val btn_confirm = findViewById<Button>(R.id.btn_confirm)

        val description = findViewById<TextView>(R.id.description)
        val btn_save = findViewById<Button>(R.id.btn_save)
        val login_et = findViewById<EditText>(R.id.login_et)



        btn_save.setOnClickListener{
            if (login_et.text.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.must_filled), Toast.LENGTH_SHORT).show()
            } else description.setText("inst: " + login_et.text.toString())
        }

        radio_btn1.setOnClickListener {
            if (radio_btn1.isChecked)
                radio_btn2.isChecked = false
        }

        radio_btn2.setOnClickListener {
            if (radio_btn2.isChecked)
                radio_btn1.isChecked = false
        }

        btn_confirm.setOnClickListener {
            if (radio_btn1.isChecked) {
                Toast.makeText(this, getString(R.string.tnx_vote), Toast.LENGTH_SHORT).show()
            } else if (radio_btn2.isChecked) {
                Toast.makeText(this, getString(R.string.tnx_vote), Toast.LENGTH_SHORT).show()
            } else Toast.makeText(this, getString(R.string.choose), Toast.LENGTH_SHORT).show()
        }






    }
}