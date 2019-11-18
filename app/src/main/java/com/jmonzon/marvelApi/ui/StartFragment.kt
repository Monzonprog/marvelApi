package com.jmonzon.marvelApi.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jmonzon.marvelApi.R
import com.jmonzon.marvelApi.repositories.MarvelService
import com.jmonzon.marvelApi.repositories.RemoteRepository

class StartFragment : Fragment (){


    private val remoteRepository = RemoteRepository(MarvelService)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.start_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getCharactersByName("thor")
    }

    fun getCharactersByName(name: String){
        remoteRepository.getCharacters (name)
    }


}