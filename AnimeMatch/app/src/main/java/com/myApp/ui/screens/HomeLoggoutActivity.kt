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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.myApp.ui.Routes.Routes
import com.myApp.ui.components.BottomNavigationBarDefault
import com.myApp.ui.components.Carrossel
import com.myApp.ui.components.CarrosselGender
import com.myApp.ui.components.MenuSearch
import com.myApp.ui.theme.blueBgAM

class HomeLoggoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeLoggout()
        }
    }
}


val routes = listOf(
    Routes.Inicio,
    Routes.Anime,
    Routes.Manga,
    Routes.Listas,
    Routes.Forum,
    Routes.Cadastro
)

@Composable
fun HomeLoggout() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBarDefault(
                routes = routes,
                onItemClicked = { route ->
                    navController.navigate(route.name){
                        launchSingleTop = true
                    }
                }
            )
        }
    ){ padding ->
        NavHost(
            navController = navController,
            startDestination = Routes.Inicio.name
        ){
            composable(route = Routes.Inicio.name){
                HomeLoggout()
            }
            composable(route = Routes.Anime.name){
                HomeLoggout()
            }
            composable(route = Routes.Manga.name){
                HomeLoggout()
            }
            composable(route = Routes.Cadastro.name){
                LoginScreen()
            }
        }
        Box(
            modifier = Modifier
                .background(blueBgAM)
                .fillMaxSize()
                .verticalScroll(ScrollState(0))
        ) {
            Column {
                MenuSearch()
                Spacer(modifier = Modifier.padding(vertical = 16.dp))
                Carrossel("Animes da temporada")
                Spacer(modifier = Modifier.padding(vertical = 24.dp))
                CarrosselGender()
                Spacer(modifier = Modifier.padding(vertical = 10.dp))

                repeat(2) {
                    Carrossel("Animes atualizados recentemente")
                    Spacer(modifier = Modifier.padding(vertical = 24.dp))
                    Carrossel("Mangas atualizados recentemente")
                    Spacer(modifier = Modifier.padding(vertical = 24.dp))
                    Carrossel("Mangas mais lidos essa semana")
                    Spacer(modifier = Modifier.padding(vertical = 24.dp))
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