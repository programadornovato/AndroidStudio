package com.programadornovato.myapplication

class tipoDeportivo(matricula:String,marca:String,modelo:String,var cilindros:Int)
    :Vehiculos(matricula,marca,modelo){
    override fun mostrarDatos():String{
        return "matricula:$matricula, marca:$marca, modelo:$modelo, cilindros:$cilindros"
    }

}