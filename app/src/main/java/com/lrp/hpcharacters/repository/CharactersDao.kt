package com.lrp.hpcharacters.repository

import androidx.room.*
import com.lrp.hpcharacters.model.HpCharacter

@Dao
interface CharactersDao {

    @Insert
    suspend fun insertCharacters(character: List<HpCharacter>)

    @Query("DELETE FROM characters")
    suspend fun deleteCharacters()

    @Query("SELECT * from characters")
    suspend fun getAllCharacters() : List<HpCharacter>

}