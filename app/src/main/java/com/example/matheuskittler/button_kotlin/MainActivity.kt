package com.example.matheuskittler.button_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var thing: Things

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        thing = Things(
            etName.text.toString(),
            etLastName.text.toString(),
            etSugest.text.toString()
        ) // TODO: Inicializador da variável


        btnEnter.setOnClickListener{
            var t: Things = Things(etName.text.toString(), etLastName.text.toString(), etSugest.text.toString())
            thing = t
            val intent = Intent(this, OtherActivity::class.java)
            intent.putExtra("things", thing)
            startActivity(intent)
        }
    }
}

