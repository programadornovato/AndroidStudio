package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vocho1=Auto()
        vocho1.meterLlave("123456")
        vocho1.mando("enciende")
    }
}