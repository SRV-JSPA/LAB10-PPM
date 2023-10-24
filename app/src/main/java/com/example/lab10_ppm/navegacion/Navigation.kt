package com.example.lab10_ppm.navegacion


import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab10_ppm.pantallas.Screen
import com.example.lab10_ppm.manejador.verifManager
import com.example.lab10_ppm.pantallas.Cusuario
import com.example.lab10_ppm.pantallas.Rcontraseña
import com.example.lab10_ppm.pantallas.Login
import com.example.lab10_ppm.pantallas.Principal
import com.google.firebase.auth.FirebaseUser


@Composable
fun Navigation(context: Context, navController: NavHostController = rememberNavController()) {


    val verifManager: verifManager = verifManager(context)
    val usuario: FirebaseUser? = verifManager.getUsuario()

    Screen {
        NavHost(
            navController = navController,
            startDestination = if(usuario == null) Routes.Login.route else Routes.main.route // validacion de sesion iniciada
        ) {
            composable(Routes.Login.route) {
                Login(
                    auth = verifManager,
                    navigation = navController
                )
            }
            composable(Routes.main.route) {
                Principal(
                    auth = verifManager,
                    navigation = navController
                )
            }
            composable(Routes.Cusuario.route) {
                Cusuario(
                    auth = verifManager,
                    navigation = navController
                )
            }
            composable(Routes.ForgotPassword.route) {
                Rcontraseña(
                    auth = verifManager,
                    navigation = navController
                )
            }
        }
    }
}
