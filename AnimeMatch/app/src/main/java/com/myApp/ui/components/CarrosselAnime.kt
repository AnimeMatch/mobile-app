package com.myApp.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.theme.Poppins
import com.myApp.ui.theme.Roboto


data class Anime(
    val id: Int,
    val text: String,
    @DrawableRes
    val image: Int
)

val animes = listOf(
    Anime(1, "Jujutsu Kaisen", image = R.drawable.jujutsu_kaisen),
    Anime(2, "Mushoku Tensei 2", image = R.drawable.mushoku_tensei),
    Anime(3, "Horimiya", image = R.drawable.horimiya),
    Anime(4, "One Piece", image = R.drawable.one_piece),
    Anime(5, "Zom 100: Zombie ni Naru Made ni Shitai 100 no Koto", image = R.drawable.zom_100),
    Anime(6, "Wotaku ni Koi wa Muzukashii", image = R.drawable.wotakoi)
)

@Composable
fun Carrossel(
    text: String
) {
    Column {
        Row (
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = text,
                fontFamily = Poppins,
                color = Color.White
            )
            Text(
                text = "mais",
                fontFamily = Roboto,
                fontSize = 10.sp,
                color = Color.White
            )
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            items(animes) { anime ->
                AnimeCard(image = anime.image, text = anime.text)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CarrosselPreview() {
    Carrossel("Animes da temporada")
}