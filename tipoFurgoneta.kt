package com.programadornovato.myapplication

class tipoFurgoneta(matricula:String,marca:String,modelo:String,var carga:Int)
    :Vehiculos(matricula,marca,modelo){
    override fun mostrarDatos():String{
        return "matricula:$matricula, marca:$marca, modelo:$modelo, carga:$carga"
    }

}