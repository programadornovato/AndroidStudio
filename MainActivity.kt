package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ladoCuadrado=5.0

        var ladoArectangulo=5.2
        var ladoBrectangulo=10.0

        var cuadrado=Cuadrilatero(ladoCuadrado)
        println("CUADRADO")
        println("Area=${cuadrado.area}")
        println("Perimetro=${cuadrado.perimetro}")

        var rectangulo=Cuadrilatero(ladoArectangulo,ladoBrectangulo)
        println("RECTANGULO")
        println("Area=${rectangulo.area}")
        println("Perimetro=${rectangulo.perimetro}")
    }
}