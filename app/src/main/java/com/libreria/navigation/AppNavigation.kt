package com.libreria.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.libreria.iu.dashboard.DashboardScreen
import com.libreria.iu.login.LoginScreen
import com.libreria.iu.login.RegistroScreen
import com.libreria.iu.perfil.PerfilScreen

@Composable
fun AppNavigation() {
    var pantalla by remember {
        mutableStateOf("login")
    }

    when (pantalla) {
        // =========================
        // LOGIN
        // =========================
        "login" -> {
            LoginScreen(
                onLogin = {
                    pantalla = "dashboard"
                },
                onRegistro = {
                    pantalla = "registro"
                }
            )
        }

        // =========================
        // REGISTRO
        // =========================
        "registro" -> {
            RegistroScreen(
                onLogin = {
                    pantalla = "login"
                }
            )
        }

        // =========================
        // DASHBOARD
        // =========================
        "dashboard" -> {
            DashboardScreen(
                onPerfil = {
                    pantalla = "perfil"
                }
            )
        }

        // =========================
        // PERFIL
        // =========================
        "perfil" -> {
            PerfilScreen(
                onBack = {
                    pantalla = "dashboard"
                },
                onLogout = {
                    pantalla = "login"
                }
            )
        }
    }
}