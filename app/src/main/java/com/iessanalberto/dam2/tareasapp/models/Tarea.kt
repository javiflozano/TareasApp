package com.iessanalberto.dam2.tareasapp.models

data class Tarea(
    var nombre: String,
    var responsable: String,
    var descripcion: String,
    var estado: String = "To do"
) {
    companion object {
        var contador = 0
        fun siguienteId():Int {
          return ++contador
        }
    }
    val id: Int = siguienteId()
}
