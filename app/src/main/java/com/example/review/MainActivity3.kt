package com.example.review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var tvTampil: TextView = findViewById(R.id.tv_tampil)
        val bundle = intent.extras
        if (bundle != null) {
            tvTampil.setText(bundle.getString("data1"))
        }


    }
}




