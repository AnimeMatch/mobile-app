package com.myApp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
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
            Button(
                modifier = Modifier
                    .width(40.dp)
                    .align(Alignment.CenterVertically),
                contentPadding = PaddingValues(8.dp),
                colors = ButtonDefaults.buttonColors(blueAM),
                onClick = { /*TODO*/ }
            ) {
                Image(
                    modifier = Modifier
                        .width(16.dp),
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "pesquisar"
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