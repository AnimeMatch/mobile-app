package com.myApp.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.myApp.ui.components.ListAnime
import com.myApp.ui.components.MenuSearch
import com.myApp.ui.components.TitleSearch
import com.myApp.ui.theme.blueBgAM


class SearchAnimeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SearchAnime()
        }
    }
}


@Composable
fun SearchAnime() {
    Scaffold(
        topBar = {
            MenuSearch()
        },
        containerColor = blueBgAM,
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding),
            verticalArrangement = Arrangement.Center,
        ) {
            TitleSearch(text = "Todos os animes")
            ListAnime()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SearchAnimePreview() {
    SearchAnime()
}