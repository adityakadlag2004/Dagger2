package com.hilt.hiltandroid.dagger.modules.car

import android.util.Log
import com.hilt.hiltandroid.dagger.modules.engine.Engine
import javax.inject.Inject

class Car
@Inject constructor(private val engine: Engine, private val wheels: Wheels) {

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "driving...")
    }

    companion object {
        private const val TAG = "Car"
    }
}