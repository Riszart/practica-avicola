package com.libreria.iu.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun BottomNavigationBar(
    onPerfil: () -> Unit
) {
    NavigationBar(
        containerColor = Color.White
    ) {
        // =========================
        // INICIO
        // =========================
        NavigationBarItem(
            selected = true,
            onClick = {
                // Inicio
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Inicio"
                )
            },
            label = {
                Text("Inicio")
            }
        )

        // =========================
        // PEDIDOS
        // =========================
        NavigationBarItem(
            selected = false,
            onClick = {
                // Pedidos
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Receipt,
                    contentDescription = "Pedidos"
                )
            },
            label = {
                Text("Pedidos")
            }
        )

        // =========================
        // CHAT
        // =========================

        NavigationBarItem(
            selected = false,
            onClick = {
                // Chat
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Chat,
                    contentDescription = "Chat"
                )
            },
            label = {
                Text("Chat")
            }
        )


        // =========================
        // SALDO
        // =========================
        NavigationBarItem(
            selected = false,
            onClick = {
                // Saldo
            },
            icon = {
                Icon(
                    imageVector =
                        Icons.Default.AccountBalanceWallet,
                    contentDescription =
                        "Saldo"
                )
            },
            label = {
                Text("Saldo")
            }
        )

        // =========================
        // PERFIL
        // =========================
        NavigationBarItem(
            selected = false,
            onClick = {
                onPerfil()
            },
            icon = {
                Icon(
                    imageVector =
                        Icons.Default.Person,
                    contentDescription =
                        "Perfil"
                )
            },
            label = {
                Text("Perfil")
            }
        )
    }
}