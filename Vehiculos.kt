package com.programadornovato.myapplication

open class Vehiculos (var matricula:String,var marca:String,var modelo:String){
    open fun mostrarDatos():String{
        return "matricula:$matricula, marca:$marca, modelo:$modelo"
    }
}