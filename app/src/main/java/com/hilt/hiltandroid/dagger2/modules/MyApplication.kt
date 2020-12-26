package com.hilt.hiltandroid.dagger2.modules

import android.app.Application
import com.hilt.hiltandroid.dagger2.components.AppComponent
import com.hilt.hiltandroid.dagger2.components.DaggerAppComponent

class MyApplication : Application() {

    lateinit var activityComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        activityComponent=DaggerAppComponent.create()

    }

    fun getActivityComponent2(): AppComponent {
        return activityComponent
    }
}