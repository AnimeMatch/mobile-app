package com.myApp.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.data.model.Anime
import com.myApp.ui.theme.Poppins

data class Icons(
    val id: Int,
    val text: String,
    @DrawableRes
    val image: Int
)

val iconsList = listOf(
    Icons(1, "Em progresso", image = R.drawable.inprogress),
    Icons(2, "Completo", image = R.drawable.completed),
    Icons(3, "Em espera", image = R.drawable.waiting),
    Icons(4, "Droppado", image = R.drawable.dropped),
    Icons(5, "No plano", image = R.drawable.plan)
)

@Composable
fun StatusBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        iconsList.forEach { icon ->
            StatusBarRow(icon)
        }
    }
}

@Composable
fun StatusBarRow(icon: Icons) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = icon.image),
                contentDescription = icon.text,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                modifier = Modifier.alignByBaseline().padding(top = 4.dp),
                text = icon.text,
                fontFamily = Poppins,
                fontSize = 8.sp,
                color = Color.White
            )
        }
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color.White,
            text = "0",
            fontFamily = Poppins,
            fontSize = 8.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StatusBarPreview() {
    StatusBar()
}