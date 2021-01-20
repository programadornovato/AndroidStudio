package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var v= arrayOfNulls<Vehiculos>(4)
        v[0]= Vehiculos("654654","Nissan","1980")
        v[1]=tipoTurismo("3215","Nissan","1985",4)
        v[2]=tipoDeportivo("654321","Nissan","1990",8)
        v[3]=tipoFurgoneta("85421","Nissan","1995",500)
        v.forEach {
            println(it?.mostrarDatos())
        }
    }
}