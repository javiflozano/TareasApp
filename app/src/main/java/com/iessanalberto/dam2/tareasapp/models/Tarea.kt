package com.iessanalberto.dam2.tareasapp.models

data class Tarea(
    var nombre: String,
    var responsable: String,
    var descripcion: String,
    var estado: Estado = Estado.PENDIENTE
) {
    companion object {
        var contador = 0
        fun siguienteId():Int {
          return ++contador
        }
    }
    val id: Int = siguienteId()
}

enum class Estado(val etiqueta: String) {
    PENDIENTE (etiqueta = "Pendiente"),
    EN_PROGRESO (etiqueta = "En progreso"),
    COMPLETADO (etiqueta = "Completada")
}
