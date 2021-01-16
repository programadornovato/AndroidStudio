package com.programadornovato.myapplication

class Calculadora{
    fun suma(n1:Int,n2:Int):Int{
        if(n1>0 && n2>0){
            return n1+n2
        }else{
            return 0
        }
    }
    fun resta(n1:Int,n2:Int):Int{
        if(n1>0 && n2>0){
            return n1-n2
        }else{
            return 0
        }
    }
    fun multiplicacion(n1:Int,n2:Int):Int{
        if(n1>0 && n2>0){
            return n1*n2
        }else{
            return 0
        }
    }
    fun divicion(n1:Double,n2:Double):Double{
        if(n1>0 && n2>0){
            return n1/n2
        }else{
            return 0.0
        }
    }
}