package com.project.marvelapp.framework.network.response

import com.google.gson.annotations.SerializedName
import com.project.core.data.response.Character

data class CharacterResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("thumbnail")
    val thumbnail: ThumbnailResponse
)

fun CharacterResponse.toCharacterModel(): Character {
    return Character(
        name = this.name,
        imageUrl = "${this.thumbnail.path}.${this.thumbnail.extension}"
            .replace("http", "https")
    )
}