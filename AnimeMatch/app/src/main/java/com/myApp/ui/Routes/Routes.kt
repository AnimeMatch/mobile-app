package com.myApp.ui.Routes

import androidx.compose.runtime.Composable

interface Route {
    val name: String
    val screen: @Composable () -> Unit
}

object Routes{
    object Inicio : Route {
        override val name = "Ínicio"
        override val screen = @Composable { }
    }
    object Anime : Route {
        override val name = "Anime"
        override val screen = @Composable {}
    }
    object Manga : Route {
        override val name = "Mangá"
        override val screen = @Composable { }
    }
    object Listas : Route {
        override val name = "Listas"
        override val screen = @Composable { }
    }
    object Forum : Route {
        override val name = "Fórum"
        override val screen = @Composable { }
    }
    object Cadastro : Route {
        override val name = "Cadastro"
        override val screen = @Composable { }
    }

}