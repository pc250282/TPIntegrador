package com.example.tpintegrador

class Profesor:Persona() {
    var numLegajo:Int=0
    var actividad:String=""
    var estado:Boolean=false
    var sueldo:Double = 0.0
        get() = field
        set(value) {
            if(value>2000.0){println("El sueldo del profesor es muy alto, debe pedir autorizacion a RRHH")
            field=0.0
            }
            else{println("Sueldo asignado correctamente")
                field = value}
        }

    override fun registrarse() {
        println("El profesor empezo a trabajar en el gimnasio")
    }

    override fun toString(): String {
        return "Profesor(idProfesor=$numLegajo, actividad='$actividad', estado=$estado, sueldo=$sueldo)"
    }

    override fun iniciarActividadFisica() {
        println("El profesor fue asignado a una actividad fisica")
    }

    fun estadoProfesor(){
        if(estado){
            println("El profesor esta activo")}
        else{
            println("El profesor esta inactivo")
        }
    }
}