package com.myApp.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animematch.R
import com.myApp.ui.theme.Roboto

@Composable
fun AnimeCard(
    @DrawableRes
    image: Int,
    text: String
) {
    Column(
        Modifier
            .widthIn(50.dp, 90.dp)
            .height(190.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .sizeIn(90.dp, 137.dp)
                .clip(RoundedCornerShape(6.dp)).clickable(
                    onClick = {
                        
                    }
                )
        )


        Text(
            modifier = Modifier
                .padding(top = 5.dp, bottom = 24.dp)
                .widthIn(50.dp, 90.dp),
            text = text,
            fontFamily = Roboto,
            style = MaterialTheme.typography.labelSmall,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = Color.White
        )
    }

}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview() {
    AnimeCard(image = R.drawable.jujutsu_kaisen, text = "Jujutsu Kaisen")
}