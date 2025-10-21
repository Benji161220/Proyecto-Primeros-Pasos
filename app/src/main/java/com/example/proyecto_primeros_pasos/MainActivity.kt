package com.example.proyecto_primeros_pasos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        val modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
        val resultado by remember { mutableStateOf(1) }
        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

        }
    }

}

