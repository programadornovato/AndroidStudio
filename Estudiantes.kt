package com.programadornovato.myapplication

class Estudiantes(nombre:String?,apellido:String?,edad:Int,var codigoEstudiante:String?,var calificacion:Double):
        Personas(nombre,apellido,edad){
    fun mostrarCodigoEstudiante(){
        println("Codigo Estudiante: $codigoEstudiante")
    }
    fun mostrarCalificacion(){
        println("Calificacion: $calificacion")
    }

}