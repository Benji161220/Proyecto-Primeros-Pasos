package com.example.proyecto_primeros_pasos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    fun ProyectoRandomizar(modifier: Modifier = Modifier){
        val alumnos by remember { mutableStateOf(1) }
        val tareas by remember { mutableStateOf(1) }
        val tareasDAM = when (tareas)(
            "Implementar conexión con base de datos PostgreSQL en Kotlin",
            "Diseñar interfaz gráfica en Android Studio con RecyclerView",
            "Crear API REST con Spring Boot y probarla con Postman",
            "Desarrollar módulo personalizado en Odoo con Python",
            "Programar hilos para gestionar procesos en segundo plano",
            "Realizar consulta SQL con JOINs en base de datos relacional",
            "Diseñar diagrama UML del proyecto final")
        val alumnos = arrayOf(
            "Carlos",
            "Eduardo",
            "Martínez",
            "López",
            "García",
            "Ruiz")
        var alumnoRandom = ""
        var cont = 0

        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(stringResource(R.string.explicacionAPP))
            Button(onClick = {
                alumnoRandom = alumnos.random()
                cont++
            }){
                Text(stringResource(R.string.elegirALumno))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text("Al alumno "+alumnoRandom+" se le asigna la tarea de: "+ tareasDAM.get(cont))
        }
    }
    @Preview
    @Composable
    fun ProyectoApp(){
        ProyectoRandomizar(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
        )
    }

}

