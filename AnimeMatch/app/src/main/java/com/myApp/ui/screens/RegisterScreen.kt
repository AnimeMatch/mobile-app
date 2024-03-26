package com.myApp.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.theme.AnimeMatchTheme
import com.myApp.ui.theme.Poppins
import com.myApp.ui.theme.Roboto
import com.myApp.ui.theme.blueAM
import com.myApp.ui.theme.blueBgAM
import com.myApp.ui.theme.blueBgAMTranparent
import com.myApp.ui.theme.yellowAM
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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
        modifier = with(Modifier) {
            fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.background),
                    contentScale = ContentScale.FillBounds,
                )
                .background(
                    brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF000712).copy(1f),
                            Color(0xFF000712).copy(.8f),
                            Color(0xFF000712).copy(0.3f)
                        )
                    )
                )
        }
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .widthIn(60.dp, 620.dp)
                    .padding(bottom = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Cadastro",
                    fontFamily = Poppins,
                    fontWeight = FontWeight(700),
                    color = Color.White,
                    fontSize = 45.sp,
                )
                Spacer(modifier = Modifier.width(25.dp))
                Divider(
                    modifier = Modifier
                        .height(3.dp)
                        .fillMaxWidth(),
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
                    fontFamily = Poppins,
                    fontWeight = FontWeight(300)
                )

                var usuario by remember {
                    mutableStateOf("")
                }

                OutlinedTextField(
                    value = usuario,
                    onValueChange = { newText ->
                        usuario = newText
                    },
                    placeholder = {
                        Text(
                            text = "batatinha123",
                            fontFamily = Roboto,
                            color = blueBgAMTranparent,
                            fontSize = 12.sp
                        )
                    },
                    textStyle = TextStyle(
                        fontFamily = Roboto,
                        fontSize = 12.sp,
                        color = blueBgAM
                    ),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = blueAM,
                        unfocusedBorderColor = Color.White,
                        errorBorderColor = Color.Red,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        cursorColor = blueBgAM
                    ),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                )

            }

            /*COLUNA PARA SEPARAR NOME E EMAIL*/
            Spacer(modifier = Modifier.height(24.dp))

//*COLUNA DO EMAIL*
            Column(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "E-mail",
                    color = Color.White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight(300)
                )

                var email by remember {
                    mutableStateOf("")
                }

                OutlinedTextField(
                    value = email,
                    onValueChange = { newText ->
                        email = newText
                    },
                    placeholder = {
                        Text(
                            text = "example@gmail.com",
                            fontFamily = Roboto,
                            color = blueBgAMTranparent,
                            fontSize = 12.sp
                        )
                    },
                    textStyle = TextStyle(
                        fontFamily = Roboto,
                        fontSize = 12.sp,
                        color = blueBgAM
                    ),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = blueAM,
                        unfocusedBorderColor = Color.White,
                        errorBorderColor = Color.Red,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        cursorColor = blueBgAM
                    ),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            /*COLUNA DA SENHA*/
            Column(
                modifier = Modifier
                    .widthIn(60.dp, 620.dp)

            ) {
                var senha by remember {
                    mutableStateOf("")
                }

                var passwordVisible by remember {
                    mutableStateOf(false)
                }

                var hidePasswordJob by remember { mutableStateOf<Job?>(null) }

                fun startHidePasswordTimer() {
                    hidePasswordJob?.cancel()
                    hidePasswordJob = CoroutineScope(Dispatchers.Default).launch {
                        delay(1000) // Tempo em milissegundos para ocultar a senha (3 segundos neste caso)
                        passwordVisible = false
                    }
                }

                Text(
                    text = "Senha",
                    color = Color.White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight(300)
                )

                OutlinedTextField(
                    value = senha,
                    onValueChange = { newText ->
                        senha = newText
                    },
                    placeholder = {
                        Text(
                            text = "● ● ● ● ●",
                            fontFamily = Roboto,
                            color = blueBgAMTranparent,
                            fontSize = 12.sp
                        )
                    },
                    textStyle = TextStyle(
                        fontFamily = Roboto,
                        fontSize = 12.sp,
                        color = blueBgAM
                    ),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = blueAM,
                        unfocusedBorderColor = Color.White,
                        errorBorderColor = Color.Red,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        cursorColor = blueBgAM
                    ),
                    shape = RoundedCornerShape(8.dp),
                    visualTransformation = if (passwordVisible) VisualTransformation.None
                    else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                passwordVisible = !passwordVisible
                                startHidePasswordTimer()
                            }
                        ) {
                            val iconResId =
                                if (passwordVisible) R.drawable.visibility_fill0_wght400_grad0_opsz24 else R.drawable.baseline_visibility_off_24
                            Icon(
                                painter = painterResource(iconResId),
                                contentDescription = "ver senha"
                            )
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )

            }

            Spacer(modifier = Modifier.height(24.dp))

            /*COLUNA DO CONFIRMA SENHA*/
            Column(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "Confirme sua senha",
                    color = Color.White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight(300)
                )

                var senha by remember {
                    mutableStateOf("")
                }

                OutlinedTextField(
                    value = senha,
                    onValueChange = { newText ->
                        senha = newText
                    },
                    placeholder = {
                        Text(
                            text = "● ● ● ● ●",
                            fontFamily = Roboto,
                            color = blueBgAMTranparent,
                            fontSize = 12.sp
                        )
                    },
                    textStyle = TextStyle(
                        fontFamily = Roboto,
                        fontSize = 12.sp,
                        color = blueBgAM
                    ),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = blueAM,
                        unfocusedBorderColor = Color.White,
                        errorBorderColor = Color.Red,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        cursorColor = blueBgAM
                    ),
                    shape = RoundedCornerShape(8.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .fillMaxWidth()
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
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp),
                color = Color.White
            )

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Ou cadastre-se com",
                    textAlign = TextAlign.Center,
                    fontSize = 17.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Logos(imageResource = R.drawable.logo_google)
                Spacer(modifier = Modifier.width(25.dp))
                Logos(imageResource = R.drawable.logo_facebook)
                Spacer(modifier = Modifier.width(25.dp))
                Logos(imageResource = R.drawable.logo_twitter)
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 24.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Tem uma conta?  ",
                    color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = "Logar",
                    color = yellowAM,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.clickable{

                    }
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










