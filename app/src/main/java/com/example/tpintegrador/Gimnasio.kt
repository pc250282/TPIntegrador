package com.example.tpintegrador

class Gimnasio {

    var idGimnasio:Int=0
    var nombreGimnasio=""
    var direccionGimnasio=Direccion()
    var cuotaGimnasio:Double=0.0
        get() {
            return field
        }
        set(value) {
            if(value>0){println("La cuota fue establecida")}
            else{println("Recorda asignarle una cuota al gimnasio")}
        }
    var listaSocios= arrayListOf<Socio>()
    var listaProfesores= arrayListOf<Profesor>()

    fun registroEnGimnasio(profesorAregistrar:Profesor, numLegajo:Int){
        var profesorAregistrar=profesorAregistrar
        profesorAregistrar.numLegajo=numLegajo
        profesorAregistrar.estado=true
        this.listaProfesores.add(profesorAregistrar)
        println("El profesor se registro en el gimnasio")
    }

    fun registroEnGimnasio(socioAregistrar:Socio){
        var socioAregistrar=socioAregistrar
        this.listaSocios.add(socioAregistrar)
        socioAregistrar.activo=true
        println("El socio ${socioAregistrar.nombre} se registro en el gimnasio")
    }

    fun movimientoCuentaContable(importe:Double, profesor:Profesor){
        var importe=importe
        println("Se le abono ${importe} al profesor ${profesor.nombre}")
        println("Se debito $importe de la cuenta contable del gimnasio")
    }

    fun movimientoCuentaContable(importe: Double, socio:Socio){
        var importe=importe
        println("El socio N° ${socio.numSocio}-- ${socio.nombre}, pago ${importe}")
        println("Se sumo $importe a la cuenta contable del gimnasio")
    }

    fun mostrarSocios(){
        println("El gimasio cuenta con los siguientes socios:")
        for(socio in listaSocios){
            println("N° ${socio.numSocio}")
            println("Nombre: ${socio.nombre}")
            println("Apellido: ${socio.apellido}")
            println("------------------------------------")
        }
    }

    fun mostrarProfesores(){
        println("El gimasio cuenta con los siguientes profesores:")
        for(profe in listaProfesores){
            println("N° ${profe.numLegajo}")
            println("Nombre: ${profe.nombre}")
            println("Apellido: ${profe.apellido}")
            println("Actividad: ${profe.actividad}")
            println("------------------------------------")
        }
    }

    fun consultarCuota(){
        println("La cuota del gimnasio es: ${this.cuotaGimnasio}")
    }

}