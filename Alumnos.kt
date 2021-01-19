package com.programadornovato.myapplication

class Alumnos (var nombre:String,var aula:String){
    var calificacion:Double=0.0
        set(value) {
            if(value>10.0){
                field=10.0
            }else if(value<0.0){
                field=0.0
            }else{
                field=value
            }
        }
}