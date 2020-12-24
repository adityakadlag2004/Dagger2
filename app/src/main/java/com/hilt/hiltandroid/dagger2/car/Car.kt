package com.hilt.hiltandroid.dagger2.car

import android.util.Log
import com.hilt.hiltandroid.dagger2.engine.Engine
import javax.inject.Inject

class Car
@Inject constructor(private val engine: Engine, private val wheels: Wheels) {

    fun drive() {
        engine.start()
        Log.d(TAG, "driving...")
    }

    companion object {
        private const val TAG = "Car"
    }
}