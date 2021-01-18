package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var c1=MiClase()
        println("c1.normal=${c1.normal}")
        println("MiClase.estatico=${MiClase.estatico}")
        c1.normal="Modificando el atributo normal"
        MiClase.estatico="Modificando el atributo estatico"
        println("c1.normal=${c1.normal}")
        println("MiClase.estatico=${MiClase.estatico}")

    }
}