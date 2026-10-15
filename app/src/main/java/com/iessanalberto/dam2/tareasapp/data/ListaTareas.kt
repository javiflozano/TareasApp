package com.iessanalberto.dam2.tareasapp.data

import com.iessanalberto.dam2.tareasapp.models.Tarea

val listaTareas: MutableList<Tarea> = mutableListOf(
    Tarea(
        nombre = "Lavar el coche",
        responsable = "Javi",
        descripcion = "Lavar el coche en el lavadero nuevo del Bon Area"
    ),
    Tarea(
        nombre = "Lavar la bici",
        responsable = "Daniel",
        descripcion = "Lavar la bici con agua y jabón"
    ),
    Tarea(
        nombre = "Comprar fruta",
        responsable = "Rubén",
        descripcion = "Comprar aguacates, limones y sandías",
        estado = "En proceso"
    ),
    Tarea(
        nombre = "Estudiar",
        responsable = "Todos",
        descripcion = "Estudiar y practicar y sobre todo programar"
    ),
    Tarea(
        nombre = "Ofrenda de flores",
        responsable = "Todos",
        descripcion = "Ir a llevar flores a quien queráis"
    )
)
