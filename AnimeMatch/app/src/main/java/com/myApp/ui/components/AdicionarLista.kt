package com.myApp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animematch.R
import com.myApp.ui.theme.Roboto
import com.myApp.ui.theme.blueAM
import com.myApp.ui.theme.blueBgAM
import com.myApp.ui.theme.yellowAM

@Composable
fun AdicionarLista() {

    var isExpanded by remember {
        mutableStateOf(false)
    }

    var icon = if (isExpanded) {
        Icons.Filled.KeyboardArrowUp
    } else {
        Icons.Filled.KeyboardArrowDown
    }

    Column(
        modifier = Modifier
            .width(178.dp)
            .height(40.dp)
            .background(yellowAM, shape = RoundedCornerShape(4.dp))
            .clickable { isExpanded = !isExpanded },
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(16.dp, 0.dp, 0.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(modifier = Modifier.width(118.dp)) {
                Text(
                    text = "Adicionar",
                    fontSize = 15.sp,
                    color = blueBgAM,
                    fontFamily = Roboto,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Divider(
                modifier = Modifier
                    .height(40.dp)
                    .width(2.dp),
                color = blueBgAM
            )
            IconButton(
                modifier = Modifier
                    .background(
                        yellowAM,
                        shape = RoundedCornerShape(4.dp)
                    )
                    .height(64.dp)
                    .width(64.dp),
                onClick = { isExpanded = true }
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = blueBgAM
                )
            }
        }

        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            offset = DpOffset(0.dp, 8.dp),
            modifier = Modifier
                .width(178.dp)
                .height(200.dp)
                .background(blueAM)
        ) {

            Column (
                modifier = Modifier
                    .background(blueAM)
                    .padding(4.dp,0.dp,4.dp,0.dp)
            ) {
                DropdownMenuItem(
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.iconea), contentDescription = null, tint = yellowAM)
                    },
                    text = {
                        Text(
                            text = "Em progresso",
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.White
                        )
                    },
                    onClick = {
                        isExpanded = false
                    },
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(blueBgAM, RoundedCornerShape(4.dp))

                )

                Spacer(modifier = Modifier.height(4.dp))

                DropdownMenuItem(
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.iconeb), contentDescription = null, tint = yellowAM)
                    },
                    text = {
                        Text(
                            text = "Completo",
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.White
                        )
                    },
                    onClick = {
                        isExpanded = false
                    },
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(blueBgAM, RoundedCornerShape(4.dp))

                )

                Spacer(modifier = Modifier.height(4.dp))

                DropdownMenuItem(
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.iconec), contentDescription = null, tint = yellowAM)
                    },
                    text = {
                        Text(
                            text = "Em espera",
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.White
                        )
                    },
                    onClick = {
                        isExpanded = false
                    },
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(blueBgAM, RoundedCornerShape(4.dp))

                )

                Spacer(modifier = Modifier.height(4.dp))

                DropdownMenuItem(
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.iconed), contentDescription = null, tint = yellowAM)
                    },
                    text = {
                        Text(
                            text = "Droppado",
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.White
                        )
                    },
                    onClick = {
                        isExpanded = false
                    },
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(blueBgAM, RoundedCornerShape(4.dp))

                )

                Spacer(modifier = Modifier.height(4.dp))

                DropdownMenuItem(
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.iconee), contentDescription = null, tint = yellowAM)
                    },
                    text = {
                        Text(
                            text = "No plano",
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.White
                        )
                    },
                    onClick = {
                        isExpanded = false
                    },
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(blueBgAM, RoundedCornerShape(4.dp))

                )

                Spacer(modifier = Modifier.height(4.dp))

                DropdownMenuItem(
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.iconef), contentDescription = null, tint = yellowAM)
                    },
                    text = {
                        Text(
                            text = "Minhas listas",
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.White
                        )
                    },
                    onClick = {
                        isExpanded = false
                    },
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(blueBgAM, RoundedCornerShape(4.dp))

                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun AdicionarListaPreview() {
    AdicionarLista()
}