package com.nna.spaceapl.network

import com.nna.spaceapl.model.SpaceItem
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("Data/space.json")
    suspend fun getDataPlanet() : Response<List<SpaceItem>>

    @GET("Data/space.json")
    suspend fun getDataStar() : Response<List<SpaceItem>>
}