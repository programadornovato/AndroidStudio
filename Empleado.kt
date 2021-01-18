package com.programadornovato.myapplication
/*
Su método set validará que el empleado tenga un rango de edad entre 18 y 80 años.
Su método get le sumará 1 año (Porque no se me ocurrió otra cosa)
nombre de tipo String
Su método set validará que el nombre tenga texto.
Su método get retorna el nombre en mayúsculas.
*/
class Empleado {
    var edad=0
        get() = field+1
        set(value) {
            if(value>=18 && value<=80) {
                field = value
            }else{
                println("Semi dios estupido te pedi una edad entre 18 y 80 años")
            }
        }
    var nombre:String?=null
        get() = field!!.toUpperCase()
        set(value) {
            if(value!!.isEmpty()){
                println("El nombre debe tener texto")
            }else{
                field = value
            }
        }

    /*
    private var edad:Int=0
    private var nombre:String?=null
    public fun setEdad(_edad:Int){
        if(_edad>=18 && _edad<=80){
            edad=_edad
        }else{
            println("Semi dios estupido te pedi una edad entre 18 y 80 años")
        }
    }
    public fun getEdad():Int{
        if(edad==0){
            return 0
        }else{
            return edad+1
        }
    }
    public fun setNombre(_nombre:String){
        if(_nombre.isEmpty()){
            println("El nombre debe tener texto")
        }else{
            nombre=_nombre
        }
    }
    public fun getNombre():String{
        return nombre!!.toUpperCase()
    }
    */
}