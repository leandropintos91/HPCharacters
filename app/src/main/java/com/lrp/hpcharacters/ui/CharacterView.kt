package com.lrp.hpcharacters.ui

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.lrp.hpcharacters.databinding.LayoutCharacterBinding
import com.lrp.hpcharacters.model.HpCharacter

class CharacterView(context: Context, val binding: LayoutCharacterBinding) : ConstraintLayout(context) {

    fun setData(character: HpCharacter) {
        binding.characterName.text = character.name
    }

}