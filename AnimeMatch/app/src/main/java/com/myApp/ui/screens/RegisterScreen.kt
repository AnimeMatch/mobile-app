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

class RegisterScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimeMatchTheme {
                RegisterScreen()
            }
        }
    }
}

@Composable
fun RegisterScreen() {
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

                
            ) {
                Text(
                    text = "Cadastro",
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

//*COLUNA DO NOME USUÁRIO*
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Nome de usuário",
                    color = Color.White,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .fillMaxWidth()

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

            /*COLUNA PARA SEPARAR NOME E EMAIL*/
            Column(
                modifier = Modifier.padding(6.dp)
            ) {
            }

//*COLUNA DO EMAIL*
            Column(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "E-mail",
                    color = Color.White,
                    textAlign = TextAlign.Left,
                    modifier = Modifier

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
            }
            Column(
                modifier = Modifier.padding(6.dp)
            ) {
            }

            /*COLUNA DA SENHA*/
            Column(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "Senha",
                    color = Color.White,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
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
            }
            Column(
                modifier = Modifier.padding(6.dp)
            ) {
            }

            /*COLUNA DO CONFIRMA SENHA*/
            Column(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "Confirme a senha",
                    color = Color.White,
                    textAlign = TextAlign.Left,
                    modifier = Modifier

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
            }

            /*BOTÃO DE CADASTRO*/
            Button(

                colors = ButtonDefaults.buttonColors(yellowAM),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                shape = RoundedCornerShape(7.dp),

                onClick = { /*TODO*/ }) {
                Text(
                    text = "Cadastrar",
                    color = Color.Black
                )

            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth(),
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
                    text = "Tem uma conta? Logar",
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
                    .padding(horizontal = 35.dp),
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
fun RegisterScreenPreview() {
    AnimeMatchTheme {
        RegisterScreen()
    }
}










