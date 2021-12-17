package com.example.mycomicsmarvellist.app

import android.app.Application
import com.example.mycomicsmarvellist.app.di.DaggerApplicationDaggerComponent

class MyComicsApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        val appComponent = DaggerApplicationDaggerComponent.create()
    }
}