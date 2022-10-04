package com.example.tpintegrador

fun main(){
    //creo instancia de clases que necesito para probar el programa
    var gimnasioLanus=Gimnasio()
    var socio1=Socio()
    var direccionSocio=Direccion()
    var profesor1=Profesor()

    //asigno valores a las propiedades de los objetos creados

    //*******************Socio**************
    direccionSocio.calle="Cavour"
    direccionSocio.altura="3006"
    direccionSocio.partido="Lanus"
    socio1.nombre="pablo"
    socio1.apellido="calvo"
    socio1.dni="35994686"
    socio1.fechaIncripcion="10-04-2022"

    //************Profesor******************
    profesor1.nombre="juan"
    profesor1.apellido="perez"
    profesor1.actividad="Profesor turno mañana"

    //*************Gimnasio*****************
    gimnasioLanus.direccionGimnasio.calle="Andrade"
    gimnasioLanus.direccionGimnasio.altura="1236"
    gimnasioLanus.direccionGimnasio.partido="CABA"
    gimnasioLanus.idGimnasio=287
    gimnasioLanus.cuotaGimnasio=0.0//ALERTA CUOTA Incorrecta


    //utilizo el setter personalizado
    profesor1.sueldo= 1900.0

    //sobreescritura de metodos
    profesor1.registrarse()
    socio1.registrarse()

    //utilizo el toString para validar el uso correcto del setter
    println(profesor1)


    //aplico sobrecarga de metodos
    gimnasioLanus.registroEnGimnasio(socio1)
    socio1.estadoSocio()
    gimnasioLanus.registroEnGimnasio(profesor1,102)
    gimnasioLanus.movimientoCuentaContable(100.20,socio1)
    gimnasioLanus.movimientoCuentaContable(1900.00, profesor1)

    //utilizo metodos de la clase Gimnasio para traer informacion de la listas
    gimnasioLanus.mostrarSocios()
    gimnasioLanus.mostrarProfesores()

}