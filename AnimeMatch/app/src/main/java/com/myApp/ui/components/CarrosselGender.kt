package com.myApp.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animematch.R


data class Gender(
    val id: Int,
    val text: String,
    @DrawableRes
    val image: Int
)

val genders = listOf(
    Anime(1, "Shounen", image = R.drawable.one_piece_),
    Anime(2, "Shoujo", image = R.drawable.kimi_ni_todoke),
    Anime(3, "Seinen", image = R.drawable.nao_lembro),
    Anime(4, "Isekai", image = R.drawable.konosuba),
    Anime(5, "Slice of life", image = R.drawable.wotakoi_)
)

@Composable
fun CarrosselGender() {
    Column {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp),
            horizontalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterHorizontally),
        ) {
            items(genders) { gender ->
                CardGender(image = gender.image, text = gender.text)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CarrosselGenderPreview() {
    CarrosselGender()
}