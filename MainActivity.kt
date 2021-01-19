package com.programadornovato.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programadornovato.myapplication.Matematicas.Basicas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p1=Personas("Juan","Perez",22)
        p1.mostrarNombre()
        p1.mostrarApellido()
        p1.mostrarEdad()
        var e1=Estudiantes("Pepe","Perez",25,"54654",10.0)
        e1.mostrarNombre()
        e1.mostrarApellido()
        e1.mostrarEdad()
        e1.mostrarCodigoEstudiante()
        e1.mostrarCalificacion()
    }
}