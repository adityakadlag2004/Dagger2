package com.hilt.hiltandroid.dagger.modules.car

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class Remote
@Inject
constructor() {

    fun setListener(car: Car) {
        Log.d(TAG, "drive: Remote Connected")
    }
}