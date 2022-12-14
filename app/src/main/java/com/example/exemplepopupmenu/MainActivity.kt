package com.example.exemplepopupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var root : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        root = findViewById(R.id.root)
        btn.setOnClickListener {
            ShowPopUpMenu()
        }
    }
    private fun ShowPopUpMenu(){
        PopupMenu(this,btn).apply {
            menuInflater.inflate(R.menu.popupmenu , menu)
            show()
        }
    }
}