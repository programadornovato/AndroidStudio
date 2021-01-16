package com.programadornovato.myapplication

class Auto(){
    private var color=""
    private var modelo=0
    private var marca=""
    private var acceso=false
    private fun enciende(){
        println("El auto esncendio")
    }
    private fun acelera(){
        println("El auto acelereo 10Km/h mas")
    }
    private fun frena(){
        println("El auto desacelero 10Km/h menos")
    }
    fun meterLlave(llave:String){
        if(llave=="123456"){
            acceso=true
            println("Tienes acceso al auto")
        }else{
            println("No tienes acceso al auto (sonar alarma)")
        }
    }
    fun mando(accion:String){
        if(acceso==true){
            if(accion=="enciende"){
                enciende()
            }
            if(accion=="acelera"){
                acelera()
            }
            if(accion=="frena"){
                frena()
            }
        }else{
            println("No tienes acceso al auto (sonar alarma)")
        }
    }
}
