package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p1=Persona("Juan",1)
        //p1.inicializar("Juan",1)
        println("Nombre=${p1.nombre} edad=${p1.edad}")
    }
}