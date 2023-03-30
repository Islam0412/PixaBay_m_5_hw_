package com.example.pixabay_m_5_hw_3

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PixaService {

    private var retrofit = Retrofit.Builder().baseUrl("https://pixabay.com")
        .addConverterFactory(GsonConverterFactory.create()).build()

    var api = retrofit.create(PixaApi::class.java)
}