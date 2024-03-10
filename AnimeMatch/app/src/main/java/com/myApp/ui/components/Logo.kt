package com.myApp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.theme.Poppins
import com.myApp.ui.theme.Roboto

@Composable
fun Logo() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            contentScale = ContentScale.Fit,
            painter = painterResource(id = R.drawable.logo_principal),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth(.13f)
                .height(88.dp)
        )
        Spacer(modifier = Modifier.size(8.dp))
        Column {
            Text(
                fontFamily = Roboto,
                text = "アニメの試合",
                color = Color.White
            )
            Text(
                fontFamily = Poppins,
                text = "Anime Match",
                color = Color.White,
                fontSize = 30.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LogoImagePreview(){
    Logo()
}