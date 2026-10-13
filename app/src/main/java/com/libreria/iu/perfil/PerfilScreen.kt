package com.libreria.iu.perfil

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PerfilScreen(

    onBack: () -> Unit,

    onLogout: () -> Unit

) {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        horizontalAlignment =
            Alignment.CenterHorizontally,

        verticalArrangement =
            Arrangement.Top

    ) {

        // =========================
        // BOTÓN REGRESAR
        // =========================

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            IconButton(
                onClick = {
                    onBack()
                }
            ) {

                Icon(
                    imageVector =
                        Icons.Default.ArrowBack,

                    contentDescription =
                        "Regresar"
                )
            }
        }


        Spacer(
            modifier =
                Modifier.height(20.dp)
        )


        // =========================
        // ICONO PERFIL
        // =========================

        Icon(

            imageVector =
                Icons.Default.Person,

            contentDescription =
                "Perfil",

            modifier =
                Modifier.size(80.dp)
        )


        Spacer(
            modifier =
                Modifier.height(15.dp)
        )


        // =========================
        // NOMBRE
        // =========================

        Text(

            text =
                "Cliente",

            fontSize =
                22.sp,

            fontWeight =
                FontWeight.Bold
        )


        Spacer(
            modifier =
                Modifier.height(5.dp)
        )


        Text(
            text =
                "cliente@avicola.com",

            fontSize =
                14.sp
        )


        Spacer(
            modifier =
                Modifier.height(40.dp)
        )


        // =========================
        // INFORMACIÓN
        // =========================

        Button(

            onClick = {
                // Próximamente
            },

            modifier =
                Modifier.fillMaxWidth()

        ) {

            Icon(
                imageVector =
                    Icons.Default.Person,

                contentDescription =
                    "Información"
            )

            Spacer(
                modifier =
                    Modifier.width(8.dp)
            )

            Text(
                text =
                    "Mi información"
            )
        }

        Spacer(
            modifier =
                Modifier.height(15.dp)
        )


        // =========================
        // CERRAR SESIÓN
        // =========================

        Button(

            onClick = {

                onLogout()
            },

            modifier =
                Modifier.fillMaxWidth()

        ) {

            Icon(

                imageVector =
                    Icons.Default.Logout,

                contentDescription =
                    "Cerrar sesión"
            )

            Spacer(
                modifier =
                    Modifier.width(8.dp)
            )

            Text(
                text =
                    "Cerrar sesión"
            )
        }
    }
}
