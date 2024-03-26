package com.myApp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.theme.Manjari
import com.myApp.ui.theme.blueBgAM

//data class Perfil(
//    val id: Int,
//    val nome: String,
//    val email: String,
//    val profileImage: Int,
//    val coverImage: Int,
//    val criacao: String,
//    val genero: String,
//    val bio: String
//)

//val perfilList = listOf(
//    Perfil(1, "Anya Forger", "anyaamanamendoim@gmail.com", R.drawable.anyafotopng, R.drawable.anyafotopng, "Março de 2023", "Mulher", "Amo amendoim!")
//)

@Composable
fun InfoPerfil() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(blueBgAM)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(Color.White)
            ) {

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(.9f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Image(
                        modifier = Modifier
                            .size(72.dp)
                            .clip(CircleShape)
                            .align(Start),
                        painter = painterResource(id = R.drawable.anyafotopng),
                        contentDescription = "foto de perfil"
                    )
                    Text(
                        text = "Anya Forger",
                        color = Color.White,
                        fontFamily = Manjari,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = "Amo amendoim! s2",
                        color = Color.White,
                        fontFamily = Manjari,
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Light
                    )
                }
                Column {
                    Button(
                        modifier = Modifier
                            .width(72.dp)
                            .align(End),
                        contentPadding = PaddingValues(4.dp),
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        onClick = { /*TODO*/ }
                    ) {
                        Image(
                            modifier = Modifier,
                            painter = painterResource(id = R.drawable.editarperfil),
                            contentDescription = "botao editar perfil",
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Editar perfil",
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = Manjari
                        )
                    }
                    Text(
                        text = "Entrou em Março de 2023",
                        color = Color.White,
                        fontFamily = Manjari,
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Light
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InfoPerfilPreview() {
    InfoPerfil()
}