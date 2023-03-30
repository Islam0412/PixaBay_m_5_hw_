package com.example.pixabay_m_5_hw_3

data class PixaModel(
    var hits: ArrayList<ImageModel>
)

data class ImageModel(
    var largeImageURL: String
)
