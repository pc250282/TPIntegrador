package com.example.tpintegrador

class Profesor:Persona() {
    var idProfesor:Int=0
    var actividad:String=""
    var estado:Boolean=false

    override fun registrarse() {
        println("Empeze a trabajar en un gimnasio")
    }
}