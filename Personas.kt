package com.programadornovato.myapplication

open class Personas (var nombre:String?,var apellido:String?,var edad:Int){
    fun mostrarNombre(){
        println("Nombre: $nombre")
    }
    fun mostrarApellido(){
        println("Apellido: $apellido")
    }
    fun mostrarEdad(){
        println("Edad: $edad")
    }
}