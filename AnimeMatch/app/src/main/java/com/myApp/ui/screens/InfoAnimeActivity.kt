package com.myApp.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.components.AdicionarLista
import com.myApp.ui.components.Carrossel
import com.myApp.ui.components.RatingBar
import com.myApp.ui.theme.Manjari
import com.myApp.ui.theme.Poppins
import com.myApp.ui.theme.Roboto
import com.myApp.ui.theme.blueAM
import com.myApp.ui.theme.blueBgAM
import com.myApp.ui.theme.yellowAM

class InfoAnimeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InfoAnime()
        }
    }
}

@Composable
fun InfoAnime() {
    var isFavorite by remember {
        mutableStateOf(false)
    }

    var icon = if (isFavorite) {
        Color.White

    } else {
        Color(0xFF942222)
    }

    val scrollState = androidx.compose.foundation.rememberScrollState()
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(
                            blueBgAM,
                            shape = RoundedCornerShape(32.dp)
                        ),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "pesquisar",
                        tint = yellowAM
                    )
                }
                IconButton(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(
                            blueBgAM,
                            shape = RoundedCornerShape(32.dp)
                        ),
                    onClick = {
                    /*TODO*/
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "pesquisar",
                        tint = Color.White
                    )
                }
            }
        }
    )
    { innerPadding ->
        Box(
            modifier = with(Modifier) {
                fillMaxSize()
                    .paint(
                        painterResource(id = R.drawable.banner),
                        contentScale = ContentScale.FillWidth,
                        alignment = Alignment.TopStart
                    )
                    .background(
                        brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF000712).copy(0f),
                                Color(0xFF000712).copy(0.6f),
                                Color(0xFF000712).copy(.65f)
                            )
                        )
                    )
                    .verticalScroll(scrollState)
                    .padding(innerPadding)
            },
            contentAlignment = Alignment.BottomCenter
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Spacer(modifier = Modifier.height(390.dp))
                Column(
                    modifier = Modifier
                        .background(blueBgAM, shape = RoundedCornerShape(24.dp, 24.dp))
                        .fillMaxWidth()
                        .height(620.dp)
                        .padding(16.dp, 24.dp, 16.dp, 0.dp)
                ) {
                    RatingBar(maxRating = 5, initialRating = 0) { rating ->

                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Wotakoi: Love is Hard for Otaku",
                        color = Color.White,
                        fontFamily = Poppins,
                        fontSize = 20.sp,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AdicionarLista()
                        Spacer(modifier = Modifier.width(20.dp))
                        IconButton(
                            modifier = Modifier
                                .background(
                                    Color(0XFFFF3B3B),
                                    shape = RoundedCornerShape(4.dp)
                                )
                                .height(40.dp)
                                .width(40.dp),
                            onClick = { isFavorite = !isFavorite }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = null,
                                tint = icon
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(
                                modifier = Modifier
                                    .height(24.dp)
                                    .width(24.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.visibility_fill0_wght400_grad0_opsz24),
                                    contentDescription = null,
                                    tint = yellowAM
                                )
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = "100k",
                                color = Color.White,
                                fontFamily = Roboto
                            )
                        }
                        Spacer(modifier = Modifier.width(35.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(
                                modifier = Modifier
                                    .height(24.dp)
                                    .width(24.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_thumb_up_off_alt_24),
                                    contentDescription = null,
                                    tint = Color.Green
                                )
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = "100k",
                                color = Color.White,
                                fontFamily = Roboto
                            )
                        }
                        Spacer(modifier = Modifier.width(35.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(
                                modifier = Modifier
                                    .height(24.dp)
                                    .width(24.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_thumb_down_off_alt_24),
                                    contentDescription = null,
                                    tint = Color.Red
                                )
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = "100k",
                                color = Color.White,
                                fontFamily = Roboto
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Narumi é secretária e esconde o fato de ser fã de yaoi. Quando muda de emprego, ela reencontra. Lorem ipsu simet",
                            color = Color.White,
                            fontFamily = Roboto,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            text = "Mais detales",
                            color = yellowAM,
                            fontFamily = Roboto,
                            modifier = Modifier.clickable { }
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0XFF080C25), shape = RoundedCornerShape(8.dp))
                            .padding(8.dp, 8.dp, 4.dp, 4.dp)
                    ) {
                        Text(
                            text = "Personagens",
                            color = Color.White,
                            fontFamily = Poppins,
                            fontWeight = FontWeight(600),
                            fontSize = 20.sp
                        )


                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(ScrollState(0))

                        ) {
                            repeat(5){
                                Column (
                                    modifier = Modifier
                                        .width(82.dp)
                                        .padding(8.dp)
                                ) {

                                    Image(
                                        painter = painterResource(id = R.drawable.banner),
                                        contentDescription = null
                                    )

                                    Text(
                                        text = "Nome personagem",
                                        color = Color.White,
                                        fontFamily = Manjari,
                                        fontSize = 10.sp,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )

                                }
                            }
                        }
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth().height(120.dp).background(blueBgAM),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column (
                        modifier = Modifier.width(138.dp)
                            .clickable {  },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "Comentários",
                            color = yellowAM,
                            fontFamily = Roboto,
                            fontWeight = FontWeight(700)
                        )
                        Divider(
                            color = yellowAM,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Column(
                        modifier = Modifier.width(138.dp)
                            .clickable {  },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Relacionados",
                            color = blueAM,
                            fontFamily = Roboto,
                            fontWeight = FontWeight(700)
                        )
                        Divider(
                            color = blueAM,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Column(
                        modifier = Modifier.width(138.dp).
                        clickable {  },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Recomendações",
                            color = blueAM,
                            fontFamily = Roboto,
                            fontWeight = FontWeight(700)
                        )
                        Divider(
                            color = blueAM,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }

            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun InfoAnimePreview() {
    InfoAnime()
}