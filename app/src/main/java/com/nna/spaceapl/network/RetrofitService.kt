package com.nna.spaceapl.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitService {

    //client bertugas sebagai alat
    private val client = OkHttpClient.Builder()
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://space-c9542-default-rtdb.firebaseio.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(client)
        .build()

    //buildservice digunakan untuk membuat service sesuai interface retrofit
    fun<T> buildservice(service:Class<T>) : T {
        return retrofit.create(service)
    }



}