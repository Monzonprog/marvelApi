package com.jmonzon.marvelApi.repositories

import com.jmonzon.marvelApi.models.characterResponse.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {

    @GET("v1/public/characters")
     fun getCharacters(@Query ("name") name: String, @Query("apikey")apikey: String,
                              @Query ("ts") ts: String, @Query("hash") hash: String): Response<CharacterResponse>
}
