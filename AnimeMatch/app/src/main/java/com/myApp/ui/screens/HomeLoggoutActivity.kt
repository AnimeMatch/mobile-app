package com.myApp.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.myApp.ui.components.Carrossel
import com.myApp.ui.theme.blueBgAM

class HomeLoggoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                HomeLoggout()
        }
    }
}

@Composable
fun HomeLoggout() {
    Box(
        modifier = Modifier
            .background(blueBgAM)
            .fillMaxSize()
    ) {
        Carrossel("Animes da temporada")
    }
}

@Preview(showBackground = true)
@Composable
fun HomeActivityPreview() {
    HomeLoggout()
}