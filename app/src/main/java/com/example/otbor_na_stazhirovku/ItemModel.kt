package com.example.otbor_na_stazhirovku

import java.io.Serializable

data class ItemModel(
    val image: String?= "Фото не загрузилось",
    val name: String?=" Имя не загрузилось",
    val year: String?="Год выпуска не загрузился",
):Serializable
