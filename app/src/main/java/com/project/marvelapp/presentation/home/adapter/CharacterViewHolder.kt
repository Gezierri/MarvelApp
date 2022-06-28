package com.project.marvelapp.presentation.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.project.core.data.response.Character
import com.project.marvelapp.R
import com.project.marvelapp.databinding.ItemCharacterBinding

class CharacterViewHolder(
    itemCharacterBinding: ItemCharacterBinding
) : RecyclerView.ViewHolder(itemCharacterBinding.root) {

    private val textName = itemCharacterBinding.tvNameCharacter
    private val imageCharacter = itemCharacterBinding.imageViewCharacter

    fun bind(character: Character) {
        textName.text = character.name
        Glide.with(itemView)
            .load(character.thumbnail.path)
            .fallback(R.drawable.ic_img_loading_error)
            .into(imageCharacter)
    }

    companion object {
        fun create(parent: ViewGroup): CharacterViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = ItemCharacterBinding.inflate(inflater, parent, false)
            return CharacterViewHolder(itemBinding)
        }
    }
}
