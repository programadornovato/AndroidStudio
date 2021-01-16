/*
Crear una clase llamada Vehículo.
Crear tres atributos marca, modelo y sku
Crear dos métodos constructores uno con marca y modelo y otro solo con sku.
Crear dos instancias de vehiculo uno se instancia con marca y modelo y el otro solo con sku.
Crear dos métodos sobrecargados llamados acelerar que reciban uno y ningun parametro y que cada uno muestre su parámetro si es que tiene.
*/
package com.programadornovato.myapplication

class Vehiculo {
    var marca:String?=null
    var modelo:String?=null
    var sku:String?=null
    constructor(_marca:String,_modelo:String){
        marca=_marca
        modelo=_modelo
    }
    constructor(_sku:String){
        sku=_sku
    }
    fun acelerar(){
        if(marca!=null){
            println("El vehiculo $marca $modelo esta acelerando")
        }else{
            println("El vehiculo $sku esta acelerando")
        }
    }
    fun acelerar(km:Int){
        if(marca!=null) {
            println("El vehiculo $marca $modelo esta acelerando a $km Km/h")
        }else{
            println("El vehiculo $sku esta acelerando a $km Km/h")
        }
    }
}