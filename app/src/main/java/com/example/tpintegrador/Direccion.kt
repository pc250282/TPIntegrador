package com.example.tpintegrador

class Direccion {

    var calle:String=""
    var altura:String=""
    var partido:String=""

    constructor()

    override fun toString(): String {
        return "Direccion(calle='$calle', altura='$altura', partido='$partido')"
    }

}