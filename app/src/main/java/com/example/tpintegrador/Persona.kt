package com.example.tpintegrador

import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.*

abstract class Persona {
    var dni:String=""
    var nombre:String= ""
        get() = field.capitalize()

    var apellido:String=""
        get() = field.capitalize()
    var fechaNacimiento:String="yyyy-mm-dd"
    var direccion=Direccion()

    abstract fun registrarse()
    abstract fun iniciarActividadFisica()


}