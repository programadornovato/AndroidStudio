package com.programadornovato.myapplication

class Cuadrilatero {
    private var lado1:Double
    private var lado2:Double
    constructor(lado:Double){
        lado1=lado
        lado2=lado
    }
    constructor(_lado1:Double,_lado2:Double){
        lado1=_lado1
        lado2=_lado2
    }
    var perimetro:Double=0.0
        get() = (lado1+lado2)*2
    var area:Double=0.0
        get() = lado1*lado2
}