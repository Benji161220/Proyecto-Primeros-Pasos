package com.example.proyecto_primeros_pasos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyecto_primeros_pasos.ui.theme.ProyectoPrimerosPasosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoPrimerosPasosTheme {
                ProyectoApp()
            }
        }
    }
    @Preview
    @Composable
    fun ProyectoApp(){
        val tareasDAM = arrayOf(
            "Implementar conexión con base de datos PostgreSQL en Kotlin",
            "Diseñar interfaz gráfica en Android Studio con RecyclerView",
            "Crear API REST con Spring Boot y probarla con Postman",
            "Desarrollar módulo personalizado en Odoo con Python",
            "Programar hilos para gestionar procesos en segundo plano",
            "Realizar consulta SQL con JOINs en base de datos relacional",
            "Diseñar diagrama UML del proyecto final")
        val modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
        val resultado by remember { mutableStateOf(1) }
        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(stringResource(R.string.explicacionAPP))
        }
    }

}

