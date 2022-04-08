package com.lrp.hpcharacters.repository

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.lrp.hpcharacters.model.HpCharacter
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

private const val BASE_URL = "http://hp-api.herokuapp.com/"


private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .build()

interface HpApiService {
    /**
     * Returns a Retrofit callback that delivers a String
     * The @GET annotation indicates that the "realestate" endpoint will be requested with the GET
     * HTTP method
     */
    @GET("api/characters")
    fun getAllCharacters(): Deferred<List<HpCharacter>>

    @GET("api/characters/students")
    fun getStudents(): Deferred<List<HpCharacter>>

    @GET("api/characters/staff")
    fun getStuff(): Deferred<List<HpCharacter>>

    @GET("api/characters/house/{house}")
    fun getCharacterByHouse(@Path("house") house : String): Deferred<List<HpCharacter>>
}

object HpApi {
    val retrofitService : HpApiService by lazy { retrofit.create(HpApiService::class.java) }
}