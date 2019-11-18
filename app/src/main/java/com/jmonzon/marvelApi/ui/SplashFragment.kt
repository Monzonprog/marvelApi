package com.jmonzon.marvelApi.ui

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jmonzon.marvelApi.R

class SplashFragment :Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Mostramos splashScreen durante 4 segundos y avanzamos a la siguiente pantalla
        Handler().postDelayed({
            findNavController().navigate(SplashFragmentDirections.splashToStart())
        }, 4000)
    }

}