package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        var a=Automotores()
        a.llantas()
        */
        var m=Motocicletas()
        m.llantas()
        var a=Autos()
        a.llantas()
        var c=Camiones()
        c.llantas()
    }
}