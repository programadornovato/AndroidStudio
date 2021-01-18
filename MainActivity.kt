package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var e1=Empleado()
        e1.edad=20
        println(e1.edad)
        e1.nombre=""
        println(e1.nombre)
        /*
        var e1=Empleado()
        e1.setEdad(17)
        println(e1.getEdad())
        e1.setNombre("juan")
        println(e1.getNombre())
        */
    }
}