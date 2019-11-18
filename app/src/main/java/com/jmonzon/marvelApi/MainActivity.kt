package com.jmonzon.marvelApi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.jmonzon.marvelApi.repositories.MarvelService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var service: MarvelService

    companion object{ //TODO: Montar método para generar un hash dinámico en cada consulta
        const val apiKey : String = R.string.public_key_marvel_developer.toString()
        const val ts: String = R.string.ts.toString()
        const val hash: String = R.string.hash.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findNavController(R.id.container)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(findNavController(R.id.container), null)
    }

    //Creamos una sola instancia de retrofit
    fun getServiceInstance (): MarvelService {

        if (!::service.isInitialized) {
            service = Retrofit.Builder()
                .baseUrl(R.string.marvel_api_base_url.toString())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MarvelService::class.java)
        }
        return service
    }
}
