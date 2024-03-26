package com.myApp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myApp.ui.theme.blueAM

@Composable
fun MenuSearch(
    searchActive: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 50.dp, 16.dp, 0.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Logo(8.sp, 16.sp, .08f, 50.dp)
        if (searchActive) {
            IconButton(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .background(
                        blueAM,
                        shape = RoundedCornerShape(32.dp)
                    ),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "pesquisar",
                    tint = Color.White
                )
            }
        } else {
//            não tem nada aqui
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuSeachPreview() {
    MenuSearch()
}