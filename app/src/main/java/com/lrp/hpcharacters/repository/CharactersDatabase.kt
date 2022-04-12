package com.lrp.hpcharacters.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lrp.hpcharacters.model.HpCharacter

@Database(entities = [HpCharacter::class], version = 1,  exportSchema = false)
abstract class CharactersDatabase : RoomDatabase() {

    abstract val charactersDao: CharactersDao

    companion object {
        @Volatile
        private var INSTANCE: CharactersDatabase? = null

        fun getInstance(context: Context): CharactersDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CharactersDatabase::class.java,
                        "hp_characters_database"
                    )
                    .fallbackToDestructiveMigration()
                    .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}