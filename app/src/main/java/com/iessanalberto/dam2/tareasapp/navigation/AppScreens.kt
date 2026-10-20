package com.iessanalberto.dam2.tareasapp.navigation

sealed class AppScreens (val route: String){
    object LogoScreen: AppScreens(route = "logo_screen")
    object TareasScreen: AppScreens(route = "tareas_screen")
    object NewTareaScreen: AppScreens(route = "new_tarea_screen")
    object EditDeleteTaskScreen: AppScreens(route = "edit_delete_task_screen")

}