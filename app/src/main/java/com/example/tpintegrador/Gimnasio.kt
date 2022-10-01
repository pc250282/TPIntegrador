package com.example.tpintegrador

class Gimnasio {

    var idGimnasio:Int=0
    var nombreGimnasio=""
    var direccionGimnasio=Direccion()
    var listaSocios= arrayListOf<Socio>()
    var listaProfesores= arrayListOf<Profesor>()

    fun registrarProfesor(profesorAregistrar:Profesor){
        var profesorAregistrar=profesorAregistrar
        this.listaProfesores.add(profesorAregistrar)
        println("El profesor se registro en el gimnasio")
    }

    fun registrarSocio(socioAregistrar:Socio){
        var socioAregistrar=socioAregistrar
        this.listaSocios.add(socioAregistrar)
        println("El socio ${socioAregistrar.nombre} se registro en el gimnasio")
    }

    fun movimientoCuentaContable(importe:Double, profesor:Profesor){
        var importe=importe
        println("Se debito $importe de la cuenta contable del gimnasio")
    }

    fun movimientoCuentaContable(importe: Double, socio:Socio){
        var importe=importe
        println("Se sumo $importe a la cuenta contable del gimnasio")
    }
}