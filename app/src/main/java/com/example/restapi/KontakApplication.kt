package com.example.restapi

import android.app.Application
import com.example.restapi.repository.AppContainer
import com.example.restapi.repository.KontakContainer

class KontakApplication : Application(){
    lateinit var container: AppContainer

    override fun onCreate(){
        super.onCreate()
        container = KontakContainer()
    }
}
