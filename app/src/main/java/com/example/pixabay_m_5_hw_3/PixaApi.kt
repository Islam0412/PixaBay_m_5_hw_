package com.example.pixabay_m_5_hw_3

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {

    @GET("/api/")
    fun getImage(
        @Query("q") keyWord: String,
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 3,
        @Query("key") key: String = "34877232-85569bd2e7cf19eba055cbd7d"
    ): Call<PixaModel>
}