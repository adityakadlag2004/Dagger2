package com.hilt.hiltandroid.dagger2.car

import android.util.Log
import com.hilt.hiltandroid.dagger2.PerActivity
import com.hilt.hiltandroid.dagger2.engine.Engine
import javax.inject.Inject
import javax.inject.Singleton

@PerActivity
class Car
@Inject constructor(
    private val driver: Driver,
    private val engine: Engine,
    private val wheels: Wheels
) {

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver is driving...$this")
    }

    companion object {
        private const val TAG = "Car"
    }
}