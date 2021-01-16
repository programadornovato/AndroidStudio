package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var v1=Vehiculo("Vocho","1980")
        //println("marca=${v1.marca} modelo=${v1.modelo}")
        v1.acelerar()
        var v2=Vehiculo("654654")
        v2.acelerar(6)
    }
}