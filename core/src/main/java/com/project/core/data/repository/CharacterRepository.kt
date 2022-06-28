package com.project.core.data.repository

import androidx.paging.PagingSource
import com.project.core.data.response.Character

interface CharacterRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>
}