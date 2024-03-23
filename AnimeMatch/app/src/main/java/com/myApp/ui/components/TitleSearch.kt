package com.myApp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myApp.ui.theme.Poppins

@Composable
fun TitleSearch(
    text: String
) {
    Column (
        modifier = Modifier
            .padding(24.dp,16.dp,24.dp,8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = text,
                color = Color.White,
                fontFamily = Poppins,
                fontWeight = FontWeight(600),
                fontSize = 18.sp
            )
            DropDown()
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth(),
            color = Color.White
        )


    }
}

@Preview(showBackground = true)
@Composable
fun TitleSearchPreview() {
    TitleSearch("Todos os animes")
}