package com.myApp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animematch.R
import com.myApp.ui.theme.Manjari
import com.myApp.ui.theme.blueAM
import com.myApp.ui.theme.blueButtomBarDefaultAM
import com.myApp.ui.theme.blueButtomBarFocusAM
import com.myApp.ui.theme.orangeBgAM
import com.myApp.ui.theme.orangeBorderAM

@Composable
fun BottomNavigationBarDefault(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
            .background(Color.Transparent),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment =Alignment.CenterVertically,
    ){
        Row(
            modifier = modifier
                .width(240.dp)
                .background(blueAM, shape = RoundedCornerShape(20.dp))
                .padding(vertical = 8.dp, horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = modifier
                    .width(90.dp)
                    .align(Alignment.CenterVertically)
                    .shadow(4.dp, shape = RoundedCornerShape(16.dp)),
                contentPadding = PaddingValues(4.dp),
                colors = ButtonDefaults.buttonColors(blueButtomBarFocusAM),
                shape = RoundedCornerShape(16.dp),
                onClick = { /*TODO*/ }
            ){
                Image(
                    modifier = modifier,
                    painter = painterResource(id = R.drawable.home_bar),
                    contentDescription = "Home",
                )
                Text(
                    modifier = modifier
                        .padding(top = 4.dp, start = 4.dp),
                    text = "Inicio",
                    fontFamily = Manjari
                )
            }
            Button(
                modifier = modifier
                    .width(40.dp)
                    .align(Alignment.CenterVertically)
                    .shadow(4.dp, shape = RoundedCornerShape(16.dp)),
                contentPadding = PaddingValues(4.dp),
                colors = ButtonDefaults.buttonColors(blueButtomBarDefaultAM),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, blueButtomBarFocusAM),
                onClick = { /*TODO*/ }
            ){
                Image(
                    modifier = modifier,
                    painter = painterResource(id = R.drawable.anime_bar),
                    contentDescription = "Anime",
                )
            }
            Button(
                modifier = modifier
                    .width(40.dp)
                    .align(Alignment.CenterVertically)
                    .shadow(4.dp, shape = RoundedCornerShape(16.dp)),
                contentPadding = PaddingValues(4.dp),
                colors = ButtonDefaults.buttonColors(blueButtomBarDefaultAM),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, blueButtomBarFocusAM),
                onClick = { /*TODO*/ }
            ){
                Image(
                    modifier = modifier,
                    painter = painterResource(id = R.drawable.manga_bar),
                    contentDescription = "Mangá",
                )
            }
            Button(
                modifier = modifier
                    .width(40.dp)
                    .align(Alignment.CenterVertically)
                    .shadow(4.dp, shape = RoundedCornerShape(16.dp)),
                contentPadding = PaddingValues(4.dp),
                colors = ButtonDefaults.buttonColors(orangeBgAM),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, orangeBorderAM),
                onClick = { /*TODO*/ }
            ){
                Image(
                    modifier = modifier,
                    painter = painterResource(id = R.drawable.register_bar),
                    contentDescription = "Register - Cadastro",
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BottomNavigationBarDefaultPreview() {
    BottomNavigationBarDefault()
}