/*
Crear la clase Carros en la que vamos a inicializar con 4 atributos.
color.
modelo.
marca.
altura.
Crear el método muestraCarro que va a mostrar los atributos anteriores.
Desde principal crear 4 instancias y posteriormente modificar los datos de la altura de cada carro.
Convertir el atributo altura en un objeto complementario y modificarlos para comprobar que es más fácil.
*/
package com.programadornovato.myapplication

class Carros (var color:String,var modelo:Int,var marca:String) {
    companion object{
        var altura=1.4
    }
    fun mustraCarro(){
        println("Color:$color, modelo:$modelo, marca:$marca, altura:$altura")
    }
}