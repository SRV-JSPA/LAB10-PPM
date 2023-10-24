package com.example.lab10_ppm.navegacion

sealed class Routes(val route: String) {
    object Login: Routes("Login")
    object main: Routes("Main")
    object Cusuario: Routes("Cusuario")
    object ForgotPassword: Routes("ForgotPassword")
}