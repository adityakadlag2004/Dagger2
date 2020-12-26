package com.hilt.hiltandroid.dagger2.modules

import android.app.Application
import com.hilt.hiltandroid.dagger2.components.AppComponent
import com.hilt.hiltandroid.dagger2.components.DaggerAppComponent

class MyApplication : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.create()

    }

    fun getAppComponentApp(): AppComponent {
        return appComponent
    }
}