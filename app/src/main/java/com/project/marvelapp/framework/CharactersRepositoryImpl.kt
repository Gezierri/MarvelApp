package com.project.marvelapp.framework

import androidx.paging.PagingSource
import com.project.core.data.repository.CharacterRepository
import com.project.core.data.repository.CharactersRemoteDataSource
import com.project.core.data.response.Character
import com.project.marvelapp.framework.network.response.DataWrapperResponse
import com.project.marvelapp.framework.paging.CharacterPagingSource
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val remoteDataSource: CharactersRemoteDataSource<DataWrapperResponse>
) : CharacterRepository {

     override fun getCharacters(query: String): PagingSource<Int, Character> {
        return CharacterPagingSource(remoteDataSource, query)
    }
}