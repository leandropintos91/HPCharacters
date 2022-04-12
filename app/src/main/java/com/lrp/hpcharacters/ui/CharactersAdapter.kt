package com.lrp.hpcharacters.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lrp.hpcharacters.databinding.LayoutCharacterBinding
import com.lrp.hpcharacters.model.HpCharacter

class CharactersAdapter(private val context: Context, val clickHandler: (HpCharacter) -> Unit) : RecyclerView.Adapter<CharactersAdapter.CharacterViewHolder>() {

    var charactersList = emptyList<HpCharacter>()

    class CharacterViewHolder(private val characterView: CharacterView): RecyclerView.ViewHolder(characterView.binding.root) {

        fun bind(character: HpCharacter, clickHandler: (HpCharacter) -> Unit) {
            characterView.setData(character)
            characterView.binding.root.setOnClickListener { clickHandler(character) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val viewBinding = CharacterView(context, LayoutCharacterBinding.inflate(LayoutInflater.from(context), parent, false))
        return CharacterViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(charactersList[position], clickHandler)
    }

    override fun getItemCount() = charactersList.size

    fun updateData(newCharacters : List<HpCharacter>) {
        charactersList = newCharacters
        this.notifyDataSetChanged()
    }

}

