package com.example.tpintegrador

fun main(){
    //creo instancia de clases que necesito para probar el programa
    var gimnasioLanus=Gimnasio()
    var socio1=Socio()
    var direccionSocio=Direccion()

    //asigno valores a las propiedades de los objetos creados
    direccionSocio.calle="Cavour"
    direccionSocio.altura="3006"
    direccionSocio.partido="Lanus"
    socio1.nombre="Pablo"
    socio1.apellido="Calvo"
    socio1.dni="35994686"

    //interactuo con los metodos de la clase

    gimnasioLanus.registrarSocio(socio1)


}