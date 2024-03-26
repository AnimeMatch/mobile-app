package com.myApp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.animematch.R
import com.myApp.ui.theme.yellowAM

@Composable
fun RatingBar(maxRating: Int = 5, initialRating: Int = 0, onRatingChanged: (Int) -> Unit) {
   val rating = remember {
       mutableStateOf(initialRating)
   }

    Row {
        for (i in 1..maxRating) {
            val color = if (i <= rating.value) yellowAM else Color.Gray
            StarButton(
                modifier = Modifier
                    .size(48.dp)
                    .clickable { rating.value = i },
                color = color
            )
        }
    }

    onRatingChanged(rating.value)
}

@Composable
fun StarButton(modifier: Modifier = Modifier, color: Color) {
    Icon(
        painter = painterResource(id = R.drawable.round_star_24,),
        contentDescription = null,
        tint = color,
        modifier = modifier.padding(4.dp)
    )
}