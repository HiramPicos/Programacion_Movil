package com.example.proyecto1.ui.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Contact(Nombre: String,Telefono: String,ImgPerfil: String,Icono: String){
    Column() {
        Text(Icono,
            color = Color.Yellow
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(ImgPerfil,
            color = Color.Red
            )

            Column(
                modifier = Modifier.padding(32.dp)
            ) {
                Text(Nombre,
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Black,
                )
                Text(Telefono)
            }

        }
    }


}
@Preview(showBackground = true)
@Composable
fun ContactPreview() {
    Column() {
        Contact(Nombre = "Juan", Telefono = "6121234567", ImgPerfil = "J", Icono = "★")

        Contact(Nombre = "Roberta", Telefono = "612123454", ImgPerfil = "R", Icono = "★")

        Contact(Nombre = "Lupe", Telefono = "61212345567", ImgPerfil = "L", Icono = "★")
    }
}