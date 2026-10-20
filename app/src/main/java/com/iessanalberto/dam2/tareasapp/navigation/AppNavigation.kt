package com.iessanalberto.dam2.tareasapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.iessanalberto.dam2.tareasapp.screens.EditDeleteTaskScreen
import com.iessanalberto.dam2.tareasapp.screens.LogoScreen
import com.iessanalberto.dam2.tareasapp.screens.NewTareaScreen
import com.iessanalberto.dam2.tareasapp.screens.TareasScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.LogoScreen.route){
        composable (route = AppScreens.LogoScreen.route) { LogoScreen(navController = navController) }
        composable (route = AppScreens.TareasScreen.route) { TareasScreen(navController = navController) }
        composable (route = AppScreens.NewTareaScreen.route) {NewTareaScreen(navController = navController)}
        composable (route = AppScreens.EditDeleteTaskScreen.route + "/{id}",
            arguments = listOf(navArgument(name = "id") {type = NavType.IntType})
            ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id")?: -1

            EditDeleteTaskScreen(navController = navController, id = id)
        }
    }
}