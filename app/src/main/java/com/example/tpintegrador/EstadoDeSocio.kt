package com.example.tpintegrador

interface EstadoDeSocio {

    fun registrarSocio(socioAregistrar:Socio){
        var socio=socioAregistrar
        println("El socio ${socioAregistrar.nombre} se registro con exito")
    }



}