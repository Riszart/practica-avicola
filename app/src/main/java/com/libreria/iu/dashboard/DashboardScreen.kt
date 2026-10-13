package com.libreria.iu.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.libreria.iu.components.BottomNavigationBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    onPerfil: () -> Unit
) {

    Scaffold(

        containerColor = Color(0xFFF5F7FA),

        topBar = {

            TopAppBar(

                title = {

                    Text(
                        text = "Avícola Machelo",
                        fontWeight = FontWeight.Bold
                    )
                },

                navigationIcon = {

                    IconButton(
                        onClick = {
                            // Menú
                        }
                    ) {

                        Icon(
                            imageVector =
                                Icons.Default.Menu,

                            contentDescription =
                                "Menú"
                        )
                    }
                },

                actions = {

                    IconButton(
                        onClick = {
                            // Notificaciones
                        }
                    ) {

                        Icon(
                            imageVector =
                                Icons.Default.Notifications,

                            contentDescription =
                                "Notificaciones"
                        )
                    }
                }
            )
        },

        bottomBar = {

            BottomNavigationBar(
                onPerfil = onPerfil
            )
        }

    ) { paddingValues ->

        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        ) {

            ClienteCard()

            Spacer(
                modifier =
                    Modifier.height(16.dp)
            )


            // =========================
            // PRIMERA FILA
            // =========================

            Row(

                modifier =
                    Modifier.fillMaxWidth(),

                horizontalArrangement =
                    Arrangement.spacedBy(10.dp)

            ) {

                AccionCard(

                    titulo =
                        "Realizar\nPedido",

                    icono =
                        Icons.Default.ShoppingCart,

                    color =
                        Color(0xFFFFB300),

                    modifier =
                        Modifier.weight(1f)
                )

                AccionCard(

                    titulo =
                        "Chatear",

                    icono =
                        Icons.Default.Chat,

                    color =
                        Color(0xFF18B878),

                    modifier =
                        Modifier.weight(1f)
                )
            }


            Spacer(
                modifier =
                    Modifier.height(10.dp)
            )


            // =========================
            // SEGUNDA FILA
            // =========================

            Row(

                modifier =
                    Modifier.fillMaxWidth(),

                horizontalArrangement =
                    Arrangement.spacedBy(10.dp)

            ) {

                AccionCard(

                    titulo =
                        "Pagar",

                    icono =
                        Icons.Default.CreditCard,

                    color =
                        Color(0xFF1976D2),

                    modifier =
                        Modifier.weight(1f)
                )

                AccionCard(

                    titulo =
                        "Ver Saldo",

                    icono =
                        Icons.Default.AccountBalanceWallet,

                    color =
                        Color(0xFF7E3FC6),

                    modifier =
                        Modifier.weight(1f)
                )
            }


            Spacer(
                modifier =
                    Modifier.height(20.dp)
            )


            // =========================
            // TÍTULO RESUMEN
            // =========================

            Row(

                modifier =
                    Modifier.fillMaxWidth(),

                horizontalArrangement =
                    Arrangement.SpaceBetween,

                verticalAlignment =
                    Alignment.CenterVertically

            ) {

                Text(

                    text =
                        "Resumen del día",

                    fontSize =
                        16.sp,

                    fontWeight =
                        FontWeight.Bold,

                    color =
                        Color(0xFF263238)
                )

                Row(

                    verticalAlignment =
                        Alignment.CenterVertically

                ) {

                    Text(

                        text =
                            "Ver más",

                        fontSize =
                            12.sp,

                        color =
                            Color(0xFF1976D2)
                    )

                    Icon(

                        imageVector =
                            Icons.Default.ArrowForwardIos,

                        contentDescription =
                            null,

                        tint =
                            Color(0xFF1976D2),

                        modifier =
                            Modifier.size(12.dp)
                    )
                }
            }


            Spacer(
                modifier =
                    Modifier.height(10.dp)
            )


            // =========================
            // RESUMEN FILA 1
            // =========================

            Row(

                modifier =
                    Modifier.fillMaxWidth(),

                horizontalArrangement =
                    Arrangement.spacedBy(10.dp)

            ) {

                ResumenCard(

                    titulo =
                        "Pedidos del día",

                    valor =
                        "12",

                    icono =
                        Icons.Default.Receipt,

                    modifier =
                        Modifier.weight(1f)
                )

                ResumenCard(

                    titulo =
                        "Pago del día",

                    valor =
                        "S/ 1,850.00",

                    icono =
                        Icons.Default.AccountBalanceWallet,

                    modifier =
                        Modifier.weight(1f)
                )
            }


            Spacer(
                modifier =
                    Modifier.height(10.dp)
            )


            // =========================
            // RESUMEN FILA 2
            // =========================

            Row(

                modifier =
                    Modifier.fillMaxWidth(),

                horizontalArrangement =
                    Arrangement.spacedBy(10.dp)

            ) {

                ResumenCard(

                    titulo =
                        "Saldo actual",

                    valor =
                        "S/ 2,450.00",

                    icono =
                        Icons.Default.CreditCard,

                    modifier =
                        Modifier.weight(1f)
                )

                ResumenCard(

                    titulo =
                        "Compras del mes",

                    valor =
                        "S/ 8,760.00",

                    icono =
                        Icons.Default.BarChart,

                    modifier =
                        Modifier.weight(1f)
                )
            }
        }
    }
}