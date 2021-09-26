package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.TextView
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var waveLoadingView : ProgressBar = findViewById(R.id.progressBar);
        waveLoadingView.setProgress(0);
        val button1 : Button = findViewById(R.id.button)
        val checkBox : CheckBox = findViewById(R.id.checkBox)
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {

                button1.setOnClickListener {
                    val edit = findViewById<View>(R.id.edittext) as EditText
                    val tview = findViewById<View>(R.id.textView2) as TextView
                    val result = edit.text.toString()
                    tview.text = result
                    waveLoadingView.setProgress(waveLoadingView.getProgress() + 10);
                }
            } else {
                val tview = findViewById<View>(R.id.textView2) as TextView
                button1.setOnClickListener {
                    tview.text = "Флажок не выбран"
                }
            }
        }
    }
}
