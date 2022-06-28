package com.project.core.data.repository

interface CharactersRemoteDataSource<T> {

    suspend fun fetchCharacter(queries: Map<String, String>): T
}