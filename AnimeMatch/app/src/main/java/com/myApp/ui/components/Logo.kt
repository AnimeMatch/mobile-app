package com.myApp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.theme.Poppins
import com.myApp.ui.theme.Roboto

@Composable
fun Logo(
    fontSize: TextUnit = 16.sp,
    fontSize2 : TextUnit = 30.sp,
    widthFraction: Float = .13f,
    height : Dp = 100.dp
) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            contentScale = ContentScale.Fit,
            painter = painterResource(id = R.drawable.logo_principal),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth(widthFraction)
                .height(height)
        )
        Spacer(modifier = Modifier.size(8.dp))
        Column {
            Text(
                fontFamily = Roboto,
                text = "アニメの試合",
                color = Color.White,
                fontSize = fontSize
            )
            Text(
                fontFamily = Poppins,
                text = "Anime Match",
                color = Color.White,
                fontSize = fontSize2
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LogoImagePreview() {
    Logo()
}