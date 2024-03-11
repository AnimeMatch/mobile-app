package com.myApp.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animematch.R
import com.myApp.ui.theme.Roboto


@Composable
fun CardGender(
    @DrawableRes
    image: Int,
    text: String
) {
    Column (
        Modifier
            .width(70.dp)
            .height(128.dp),
        horizontalAlignment =  Alignment.CenterHorizontally
    ) {
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth(.9f)
                .height(65.dp)
                .clip(CircleShape),
            painter = painterResource(id = image),
            contentDescription = null)
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = text,
            style = MaterialTheme.typography.labelSmall,
            fontFamily = Roboto,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardGenderPreview() {
    CardGender(image = R.drawable.jujutsu_kaisen, text = "Jujutsu Kaisen")
}