package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Carros.altura=1.6
        var c1=Carros("Blanco",1981,"Vocho")
        c1.mustraCarro()
        var c2=Carros("Azul",1982,"Vocho")
        c2.mustraCarro()
        var c3=Carros("Verde",1983,"Vocho")
        c3.mustraCarro()
        var c4=Carros("Negro",1984,"Vocho")
        c4.mustraCarro()
    }
}