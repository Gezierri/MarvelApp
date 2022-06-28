package com.project.marvelapp.framework.network

import com.project.core.data.response.DataWrapper
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface NetworkApi {

    @GET("characters")
    suspend fun getCharacters(
        @QueryMap
        queries: Map<String, String>
    ): DataWrapper
}