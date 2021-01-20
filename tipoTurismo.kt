package com.programadornovato.myapplication

class tipoTurismo(matricula:String,marca:String,modelo:String,var numeroPuertas:Int)
    :Vehiculos(matricula,marca,modelo){
    override fun mostrarDatos():String{
        return "matricula:$matricula, marca:$marca, modelo:$modelo, numeroPuertas:$numeroPuertas"
    }

}