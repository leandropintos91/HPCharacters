package com.lrp.hpcharacters.service

import android.content.Context
import com.lrp.hpcharacters.model.HpCharacter
import com.lrp.hpcharacters.repository.CharactersDatabase
import com.lrp.hpcharacters.repository.HpApi

class HpCharactersService(context: Context) {

    val charactersDatabase = CharactersDatabase.getInstance(context)

    suspend fun getAllCharacters() : List<HpCharacter> {
        val characterList = HpApi.retrofitService.getAllCharacters().await()
        charactersDatabase.charactersDao.deleteCharacters()
        charactersDatabase.charactersDao.insertCharacters(characterList)
        val gotCharacters = charactersDatabase.charactersDao.getAllCharacters()
        gotCharacters?.let {
            return gotCharacters
        }

    }

}