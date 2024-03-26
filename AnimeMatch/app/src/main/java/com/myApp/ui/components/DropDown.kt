package com.myApp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myApp.ui.theme.Roboto
import com.myApp.ui.theme.blueAM
import com.myApp.ui.theme.blueBgAM
import com.myApp.ui.theme.yellowAM

@Composable
fun DropDown() {
    val gender = listOf(
        "Sounen",
        "Seinen",
        "Shoujoooooooooooooooooooooooo",
        "Romance",
        "Sport",
        "Sounen",
        "Seinen",
        "Shoujo",
        "Romance",
        "Sport"
    )

    var option: String by remember {
        mutableStateOf("Selecione")
    }

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
            .width(132.dp)
            .height(30.dp)
            .border(1.dp, blueAM, RoundedCornerShape(8.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .padding(16.dp, 0.dp, 0.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(modifier = Modifier.width(78.dp)) {
                Text(
                    text = option,
                    fontSize = 12.sp,
                    color = Color.White,
                    fontFamily = Roboto,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Divider(
                modifier = Modifier
                    .height(40.dp)
                    .width(1.dp),
                color = Color.White
            )
            IconButton(
                modifier = Modifier
                    .background(
                        blueBgAM,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .height(64.dp)
                    .width(64.dp),
                onClick = { isExpanded = true }
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }

        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            offset = DpOffset(0.dp, 8.dp),
            modifier = Modifier
                .width(132.dp)
                .height(200.dp)
        ) {
            gender.forEach { label ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = label,
                            fontSize = 14.sp,
                            fontFamily = Roboto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    },
                    onClick = {
                        option = label
                        isExpanded = false
                    },
                    modifier = Modifier.fillMaxHeight()

                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropDownPreview() {
    DropDown()
}