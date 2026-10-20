package com.iessanalberto.dam2.tareasapp.models

data class Tarea(
    val nombre: String,
    val responsable: String,
    val descripcion: String,
    val estado: String = "To do"
) {
    companion object {
        var contador = 0
        fun siguienteId():Int {
          return contador++
        }
    }
    val id: Int = siguienteId()
}
