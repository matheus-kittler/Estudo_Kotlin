package com.example.matheuskittler.button_kotlin

import java.io.Serializable

class Things : Serializable {

    var name: String? = null
    var lastName: String? = null
    var sugest: String? = null

    constructor(name: String?, lastName: String?, sugest: String?) {
        this.name = name
        this.lastName = lastName
        this.sugest = sugest
    }
}