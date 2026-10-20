package com.iessanalberto.dam2.tareasapp.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.iessanalberto.dam2.tareasapp.data.buscarTarea
import com.iessanalberto.dam2.tareasapp.models.Tarea

@Composable
fun EditDeleteTaskScreen(navController: NavController, id: Int){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        var context = LocalContext.current
        if (id == -1) {
            // Toast y vuelves
        }
        var tarea = buscarTarea(id = id)


    }
}