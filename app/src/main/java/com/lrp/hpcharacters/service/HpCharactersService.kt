package com.lrp.hpcharacters.service

import com.lrp.hpcharacters.model.HpCharacter
import com.lrp.hpcharacters.repository.HpApi
import kotlinx.coroutines.Deferred
import retrofit2.await

class HpCharactersService {

    fun getAllCharacters() : Deferred<List<HpCharacter>> {
        return HpApi.retrofitService.getAllCharacters()
    }

}