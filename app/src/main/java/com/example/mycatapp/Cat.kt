package com.example.mycatapp

import com.google.gson.annotations.SerializedName
import com.example.mycatapp.CatImage

data class Cat (
    val id:String,
    val name: String,
    val temperament: String,
    val origin: String,
    val description: String,
    val image: CatImage
    )
