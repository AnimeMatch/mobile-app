package com.example.animematch

import android.media.Image
import android.os.Bundle
import android.print.PrintAttributes.Margins
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.ui.theme.AnimeMatchTheme

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimeMatchTheme {
                SplashScreen()
            }
        }
    }
}

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF000B1C),
                        Color(0xFF232B90),
                        Color(0xFF4641D0),
                        Color(0xFF232B90),
                        Color(0xFF000B1C)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .padding(48.dp, 320.dp, 48.dp, 320.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                LogoImage()
                Column {
                    Text(
                        text = "アニメの試合",
                        color = Color.White
                    )
                    Text(
                        text = "Anime Match",
                        color = Color.White,
                        fontSize = 40.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth(),
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Iluminando o seu caminho",
                color = Color.White
            )
        }
    }
}

@Composable
fun LogoImage() {
    Image(
        painter = painterResource(id = R.drawable.logo_principal),
        contentDescription = "Logo",
        modifier = Modifier
            .width(48.dp)
            .height(88.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    AnimeMatchTheme {
        SplashScreen()
    }
}