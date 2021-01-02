package com.devtides.androidcoroutinesretrofit.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CoutriesServices {
    private val BASE_URL = "https://raw.githubusercontent.com"

    fun getCountrieService(): CoutriesApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoutriesApi::class.java)
    }
}