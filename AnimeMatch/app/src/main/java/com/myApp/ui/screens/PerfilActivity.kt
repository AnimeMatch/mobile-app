package com.myApp.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.myApp.ui.components.Carrossel
import com.myApp.ui.components.InfoPerfil
import com.myApp.ui.components.StatusBar
import com.myApp.ui.theme.AnimeMatchTheme
import com.myApp.ui.theme.blueBgAM

class PerfilActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimeMatchTheme {
                Perfil()
            }
        }
    }
}

@Composable
fun Perfil() {
    Box(
        modifier = Modifier
            .background(blueBgAM)
            .fillMaxSize()
            .verticalScroll(ScrollState(0))
    ){
        Column {
            InfoPerfil()
            Spacer(modifier = Modifier.padding(vertical = 40.dp))
            StatusBar()
            Spacer(modifier = Modifier.padding(vertical = 40.dp))
            Carrossel("Animes favoritos")
            Spacer(modifier = Modifier.padding(vertical = 16.dp))
            Carrossel("Mangás favoritos")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PerfilActivityPreview() {
    Perfil()
}