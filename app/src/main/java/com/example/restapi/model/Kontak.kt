package com.example.restapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    @SerialName("nohp")
    val telpon: String,
    @SerialName("email")
    val alamat: String,
)
