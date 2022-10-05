package com.example.tpintegrador

class Socio:Persona() {
    var numSocio:Int=1
    var fechaIncripcion:String=""
    var activo:Boolean=false

    override fun registrarse() {
        println("Soy un socio nuevo")
    }

    override fun iniciarActividadFisica() {
        println("El socio se anoto en una actividad fisica")
    }

    fun estadoSocio():String{
        var transformacionEstado=""
        if(activo){
            transformacionEstado="Activo"}
        else{
            transformacionEstado="Inactivo"
        }
        return transformacionEstado
    }

    override fun toString(): String {
        return "Socio(numSocio=$numSocio, fechaIncripcion='$fechaIncripcion', activo=$activo)"
    }


}