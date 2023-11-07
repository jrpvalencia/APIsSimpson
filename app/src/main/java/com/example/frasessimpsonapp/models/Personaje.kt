package com.example.frasessimpsonapp.models

import com.google.gson.annotations.SerializedName

data class Personaje(
    @SerializedName("quote")
    var frase: String,
    @SerializedName("character")
    var personaje: String,
    @SerializedName("image")
    var imagen: String,
    @SerializedName("characterDirection")
    var direccionPersonaje: String
)
