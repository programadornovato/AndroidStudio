package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cantidadAlumnos=5
        var a=Array<Alumnos?>(cantidadAlumnos){null}
        a[0]= Alumnos("Juan","b")
        a[0]?.calificacion=11.0
        a[1]=Alumnos("Pepe","b")
        a[1]?.calificacion=-10.0
        a[2]=Alumnos("Maria","a")
        a[2]?.calificacion=5.0
        a[3]=Alumnos("Lola","a")
        a[3]?.calificacion=9.0
        a[4]=Alumnos("Tere","a")
        a[4]?.calificacion=9.0

        var suma=0.0
        var promedio=0.0
        a.forEach {
            suma=suma+it!!.calificacion
        }
        promedio=suma/cantidadAlumnos
        println("El promedio es $promedio")
    }
}