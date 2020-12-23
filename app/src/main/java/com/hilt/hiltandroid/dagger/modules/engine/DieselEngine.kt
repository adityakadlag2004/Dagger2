package com.hilt.hiltandroid.dagger.modules.engine

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class DieselEngine
@Inject
constructor(var horsepower:Int) : Engine {


    override fun start() {
        Log.d(TAG, "drive: Diesel Engine Started horsepower=$horsepower")
    }
}