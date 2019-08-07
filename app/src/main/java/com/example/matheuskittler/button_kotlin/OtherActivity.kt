package com.example.matheuskittler.button_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_other.*
import java.util.ArrayList

class OtherActivity : AppCompatActivity() {

    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        adapter = Adapter()

        val things = ArrayList<Things>()

        val adapter = Adapter(this, things, inflater = LayoutInflater.from(this))
        rvThings.adapter = adapter

        rvThings.layoutManager = (LinearLayoutManager(this, LinearLayout.VERTICAL, false))

        var t: Things = getIntent().getSerializableExtra("things") as Things
        adapter.addThings(t)
    }
}

