package com.lrp.hpcharacters.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.lrp.hpcharacters.R
import com.lrp.hpcharacters.databinding.FragmentCharacterDetailBinding
import com.lrp.hpcharacters.model.HpCharacter

class CharacterDetailsFragment: Fragment() {

    lateinit var binding: FragmentCharacterDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentCharacterDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val character = arguments?.getSerializable("CHARACTER") // TODO quit hardcoded code
        bind(character as HpCharacter)
    }

    private fun bind(character: HpCharacter) {
        binding.characterName.text = character.name
        binding.characterHouse.text = character.house
        binding.characterAncestry.text = character.ancestry
        binding.characterIsWizard.text = "Is Wizard: " + character.wizard.toString()
        context?.let { itContext ->
            binding.characterIsFavourite.setImageDrawable(
                ContextCompat.getDrawable(itContext,
                if (character.wizard) R.drawable.ic_favourite else R.drawable.ic_no_favourite)
            )
        }
    }

    public class Contract {
        companion object {
            val CHARACTER = "CHARACTER"

            fun createBundle(character: HpCharacter) : Bundle {
                val bundle = Bundle()
                bundle.putSerializable(CHARACTER, character)
                return bundle
            }
        }
    }

}