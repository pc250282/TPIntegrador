package com.example.tpintegrador

class Socio:Persona() {
    var numSocio:Int=0
    var fechaIncripcion:String=""
    var activo:Boolean=false

    override fun registrarse() {
        println("Soy un socio nuevo")
    }
}