package com.myApp.data.model

import androidx.annotation.DrawableRes
import com.example.animematch.R

data class Anime(
    val id: Int,
    val text: String,
    @DrawableRes
    val image: Int
)
