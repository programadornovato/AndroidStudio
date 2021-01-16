package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cal=Calculadora()
        var n1=1
        var n2=2
        var res=cal.suma(n1,n2)
        println("Humano aqui esta tu pinche suma de $n1 y $n2 = $res")
        res=cal.resta(n1,n2)
        println("Humano aqui esta tu pinche resta de $n1 y $n2 = $res")
        res=cal.multiplicacion(n1,n2)
        println("Humano aqui esta tu pinche multiplicacion de $n1 y $n2 = $res")
        var resD=cal.divicion(n1.toDouble(),n2.toDouble())
        println("Humano aqui esta tu pinche divicion de $n1 y $n2 = $resD")
    }
}