package com.myApp.ui.screens

import android.os.Bundle
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.theme.AnimeMatchTheme
import com.myApp.ui.theme.yellowAM

class LoginScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimeMatchTheme {
                LoginScreen()
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF000B1C),
                        Color(0xFF000B1C),
                        Color(0xFF000B50),
                        Color(0xFF000B50),
                        Color(0xFF000712)
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp)

        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            ) {
                Text(
                    text = "Login",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 45.sp,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .padding(
                            vertical = 55.dp
                        )
                )
                Divider(
                    modifier = Modifier
                        .padding(vertical = 90.dp)
                        .padding(horizontal = 15.dp)
                        .height(3.dp),
                    color = yellowAM,
                )
            }

//*COLUNA DO EMAIL*
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "E-mail",
                    color = Color.White,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            vertical = 1.dp,
                        )
                )
                var email by remember {
                    mutableStateOf("")
                }

                OutlinedTextField(
                    modifier = Modifier
                        .height(30.dp)
                        .fillMaxWidth()
                        .clip(MaterialTheme.shapes.small)
                        .background(color = Color.White),

                    value = email,
                    onValueChange = { email = it },

                    )
            }

            /*COLUNA PARA SEPARAR EMAIL E SENHA*/
            Column(
                modifier = Modifier.padding(10.dp)
            ) {

            }


//*COLUNA DA SENHA*
            Column(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "Senha",
                    color = Color.White,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .padding(
                            vertical = 1.dp,
                        )
                )

                var senha by remember {
                    mutableStateOf("")
                }

                OutlinedTextField(
                    modifier = Modifier
                        .height(30.dp)
                        .fillMaxWidth()
                        .clip(shape = MaterialTheme.shapes.small)
                        .background(color = Color.White),
                    value = senha,
                    onValueChange = { senha = it }
                    )

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Esqueceu sua senha?",
                        color = Color.White,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                vertical = 8.dp,
                            )
                    )
                }

            }

            /*BOTÃO DE LOGIN*/
            Button(

                colors = ButtonDefaults.buttonColors(yellowAM),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(vertical = 35.dp)
                    .shadow(50.dp),
                shape = RoundedCornerShape(7.dp),

                onClick = { /*TODO*/ }) {
                Text(
                    text = "Login",
                    color = Color.Black
                )

            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)
                ,
                color = Color.White
            )

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Ou cadastre-se com",
                    textAlign = TextAlign.Center,
                    fontSize = 17.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp))

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Logos(imageResource = R.drawable.logo_google)
                Logos(imageResource = R.drawable.logo_facebook)
                Logos(imageResource = R.drawable.logo_twitter)
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Não tem conta? Cadastre-se",
                    color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 15.dp)
                        .fillMaxWidth()
                    )
            }

            /*BOTÃO PULAR ETAPA*/
            Button(
                colors = ButtonDefaults.buttonColors(yellowAM),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 35.dp)
                    .shadow(10.dp),
                shape = RoundedCornerShape(7.dp),
                onClick = { /*TODO*/ }) {
                Text(
                    text = "Pular Etapa",
                    color = Color.Black
                )

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AnimeMatchTheme {
        LoginScreen()
    }
}

@Composable
fun Logos(imageResource: Int){
    Spacer(modifier = Modifier.width(25.dp))
    Image(

        painter = painterResource(id = imageResource),
        contentDescription = "Logos",
        modifier = Modifier
            .width(45.dp)
            .height(50.dp))

}








