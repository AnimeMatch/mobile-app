package com.myApp.ui.screens

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.myApp.ui.components.BottomNavigationBarDefault
import com.myApp.ui.components.Carrossel
import com.myApp.ui.components.ListGender
import com.myApp.ui.components.MenuSearch
import com.myApp.ui.theme.blueBgAM

class HomeLoggoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                )
        setContent {
            HomeLoggout()
        }
    }
}

@Composable
fun HomeLoggout() {
    Scaffold(
        bottomBar = {BottomNavigationBarDefault()}
    ){it
        Box(
            modifier = Modifier
                .background(blueBgAM)
                .fillMaxSize()
                .verticalScroll(ScrollState(0))
        ) {
            Column{
                MenuSearch()
                Spacer(modifier = Modifier.padding(vertical = 16.dp))
                Carrossel("Animes da temporada")
                Spacer(modifier = Modifier.padding(vertical = 16.dp))
                ListGender()
                Spacer(modifier = Modifier.padding(vertical = 16.dp))

                repeat(2) {
                    Carrossel("Animes atualizados recentemente")
                    Spacer(modifier = Modifier.padding(vertical = 16.dp))
                    Carrossel("Mangas atualizados recentemente")
                    Spacer(modifier = Modifier.padding(vertical = 16.dp))
                    Carrossel("Mangas mais lidos essa semana")
                    Spacer(modifier = Modifier.padding(vertical = 16.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeActivityPreview() {
    HomeLoggout()
}