package com.myApp.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animematch.R
import com.myApp.data.model.Anime



val animesGrid = listOf(
    Anime(1, "Jujutsu Kaisen", image = R.drawable.jujutsu_kaisen),
    Anime(2, "Mushoku Tensei 2", image = R.drawable.mushoku_tensei),
    Anime(3, "Horimiya", image = R.drawable.horimiya),
    Anime(4, "One Piece", image = R.drawable.one_piece),
    Anime(5, "Zom 100: Zombie ni Naru Made ni Shitai 100 no Koto", image = R.drawable.zom_100),
    Anime(6, "Wotaku ni Koi wa Muzukashii", image = R.drawable.wotakoi)
)

@Composable
fun ListAnime() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(128.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(animesGrid){anime->
            AnimeCard(image = anime.image, text = anime.text)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaAnimePreview() {
    ListAnime()
}