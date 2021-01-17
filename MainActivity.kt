package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var matBasicas=Basicas(1,2)
        println("Suma=${matBasicas.suma()}")
        println("Resta=${matBasicas.resta()}")
        println("Multiplicacion=${matBasicas.multiplicacion()}")
        println("Divicion=${matBasicas.divicion()}")
    }
}