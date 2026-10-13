package com.libreria.iu.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ClienteCard() {
    Card(
        modifier =
            Modifier.fillMaxWidth(),
        shape =
            RoundedCornerShape(14.dp),
        colors =
            CardDefaults.cardColors(
                containerColor = Color.White
            ),
        elevation =
            CardDefaults.cardElevation(
                defaultElevation = 2.dp
            )
    ) {
        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(14.dp),
            verticalAlignment =
                Alignment.CenterVertically

        ) {
            androidx.compose.foundation.layout.Box(
                modifier =
                    Modifier
                        .size(50.dp)
                        .clip(
                            RoundedCornerShape(50.dp)
                        )
                        .background(
                            Color(0xFFE3F2FD)
                        ),
                contentAlignment =
                    Alignment.Center

            ) {
                Icon(
                    imageVector =
                        Icons.Default.Person,
                    contentDescription =
                        "Cliente",
                    tint =
                        Color(0xFF1976D2),
                    modifier =
                        Modifier.size(30.dp)
                )
            }

            Spacer(
                modifier =
                    Modifier.width(12.dp)
            )

            Column {
                Text(
                    text =
                        "Hola, Cliente",
                    fontSize =
                        16.sp,
                    fontWeight =
                        FontWeight.Bold
                )

                Text(
                    text =
                        "Bienvenido a Avícola Machelo",
                    fontSize =
                        12.sp,
                    color =
                        Color.Gray
                )
            }
        }
    }
}