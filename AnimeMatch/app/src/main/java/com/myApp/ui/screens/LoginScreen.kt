package com.myApp.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
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
import com.myApp.ui.theme.Manjari
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
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
        val scrollState = androidx.compose.foundation.rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .widthIn(60.dp, 620.dp)
                    .padding(bottom = 16.dp, top = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Login",
                    fontFamily = Poppins,
                    fontWeight = FontWeight(700),
                    color = Color.White,
                    fontSize = 45.sp,

                    )

                Spacer(modifier = Modifier.width(15.dp))
                Divider(
                    modifier = Modifier
                        .height(3.dp)
                        .fillMaxWidth(),
                    color = yellowAM,
                )
            }

//*COLUNA DO EMAIL*
            Column(
                modifier = Modifier
                    .widthIn(60.dp, 620.dp)
            ) {

                var email by remember {
                    mutableStateOf("")
                }

                Text(
                    text = "Email",
                    color = Color.White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight(300)
                )

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

            /*SPACER PARA SEPARAR EMAIL E SENHA*/
            Spacer(
                modifier = Modifier.height(24.dp)
            )


//*COLUNA DA SENHA*
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
                        delay(3000) // Tempo em milissegundos para ocultar a senha (3 segundos neste caso)
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
                                if (passwordVisible) R.drawable.baseline_lock_open_24 else R.drawable.baseline_lockclose_outline_24
                            Icon(
                                painter = painterResource(iconResId),
                                contentDescription = "ver senha"
                            )
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val checkedState = remember { mutableStateOf(false) }
                    Switch(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = blueAM,
                            checkedTrackColor = Color(0xFFFADC82),
                            uncheckedThumbColor = blueBgAM,
                            uncheckedTrackColor = Color.White,
                            uncheckedBorderColor = blueAM,
                            checkedBorderColor = blueAM
                        )
                    )

                    Text(
                        text = "Esqueceu a senha?",
                        color = Color.White,
                        fontFamily = Poppins,
                        fontWeight = FontWeight(300),
                        fontSize = 12.sp,
                        modifier = Modifier.clickable{

                        }
                    )
                }

            }

            /*BOTÃO DE LOGIN*/
            Button(
                colors = ButtonDefaults.buttonColors(yellowAM),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .widthIn(420.dp, 820.dp)
                    .padding(vertical = 32.dp)
                    .shadow(50.dp),
                shape = RoundedCornerShape(7.dp),

                onClick = { /*TODO*/ }) {
                Text(
                    text = "Login",
                    color = Color.Black,
                    fontFamily = Manjari,
                    modifier = Modifier.padding(top = 4.dp)
                )

            }
            Divider(
                modifier = Modifier
                    .widthIn(120.dp, 620.dp)
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
                    text = "Não tem conta?  ",
                    color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = "Cadastre-se",
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
fun Logos(imageResource: Int) {

    Image(
        painter = painterResource(id = imageResource),
        contentDescription = "Logos",
        modifier = Modifier
            .width(45.dp)
            .height(50.dp)
    )

}








