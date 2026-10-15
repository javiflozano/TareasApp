package com.iessanalberto.dam2.tareasapp.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.iessanalberto.dam2.tareasapp.data.listaTareas
import com.iessanalberto.dam2.tareasapp.models.Tarea
import com.iessanalberto.dam2.tareasapp.navigation.AppScreens

@Composable
fun NewTareaScreen(navController: NavController){
    Scaffold(){
        innerpadding -> NewTareaBodyContent(navController = navController, modifier = Modifier.padding(innerpadding))
    }
}

@Composable
fun NewTareaBodyContent(navController: NavController, modifier: Modifier) {
    var context = LocalContext.current
    var nombre by remember { mutableStateOf("") }
    var responsable by remember { mutableStateOf("Pendiente de asignación") }
    var descripcion by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("Pendiente") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(value = nombre,
            onValueChange = {nombre = it},
            label = { Text(text = "Nombre") }
            )
        OutlinedTextField(value = responsable,
            onValueChange = {responsable = it},
            label = { Text(text = "Responsable") }
        )
        OutlinedTextField(value = descripcion,
            onValueChange = {descripcion = it},
            label = { Text(text = "Descripción") }
        )
        OutlinedTextField(value = estado,
            onValueChange = {estado = it},
            label = { Text(text = "Estado") }
        )
        Button(onClick = {
            if (nombre.isBlank() || responsable.isBlank() || descripcion.isBlank() || estado.isBlank()){
                Toast.makeText(context,"Todos los campos son obligatorios",Toast.LENGTH_SHORT).show()
            } else {
                listaTareas.add(
                    Tarea(nombre = nombre,
                        responsable = responsable,
                        descripcion = descripcion,
                        estado = estado
                    ))
                Toast.makeText(context,"Añadida la nueva tarea",Toast.LENGTH_SHORT).show()
                navController.navigate(AppScreens.TareasScreen.route)
            }

        }) {
            Text(text = "Guardar")
        }
    }
}