package com.example.proyecto1.ui.Components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MainContact(){
    Text("MIS CONTACTOS",
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Naranja
        )

    Column() {
        Contact(Nombre = "Juan", Telefono = "6121234567", ImgPerfil = "J", Icono = "★")

        Contact(Nombre = "Roberta", Telefono = "612123454", ImgPerfil = "R", Icono = "★")

        Contact(Nombre = "Lupe", Telefono = "61212345567", ImgPerfil = "L", Icono = "★")
    }

}
@Preview(showBackground = true)
@Composable
fun ShowMainContac(){
    MainContact()
}
val Naranja = Color(0xFFFFCC00)