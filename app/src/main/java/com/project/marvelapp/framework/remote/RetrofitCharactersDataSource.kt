package com.project.marvelapp.framework.remote

import com.project.core.data.response.DataWrapper
import com.project.core.data.repository.CharactersRemoteDataSource
import com.project.marvelapp.framework.network.NetworkApi
import javax.inject.Inject

class RetrofitCharactersDataSource @Inject constructor(
    private val networkApi: NetworkApi
): CharactersRemoteDataSource<DataWrapper> {

    override suspend fun fetchCharacter(queries: Map<String, String>): DataWrapper {
        TODO("Not yet implemented")
    }
}