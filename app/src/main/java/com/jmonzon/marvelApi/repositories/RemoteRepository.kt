package com.jmonzon.marvelApi.repositories

import android.util.Log
import com.jmonzon.marvelApi.R
import com.jmonzon.marvelApi.models.characterResponse.CharacterResponse

class RemoteRepository (private val marvelService: MarvelService){

    companion object{ //TODO: Montar método para generar un hash dinámico en cada consulta
        private const val apiKey : String = R.string.public_key_marvel_developer.toString()
        private const val ts: String = R.string.ts.toString()
        private const val hash: String = R.string.hash.toString()
    }


      fun getCharacters(name: String): List<CharacterResponse>?{
        return try {

            val response =
                marvelService.getCharacters(name, apiKey, ts, hash)

            if (response.isSuccessful) {
                Log.d("Respuesta marvelService.getCharacters: ", "Exito")
                return null
            } else {
                null
            }

        } catch (e: Exception) {
            null
        }
    }
}