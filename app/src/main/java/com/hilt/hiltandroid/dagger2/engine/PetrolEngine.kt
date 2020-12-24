package com.hilt.hiltandroid.dagger2.engine

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine
@Inject
constructor(@Named("horsepower")private val horsePower: Int,
            @Named("capacity")private val capacity:Int) : Engine {


    override fun start() {
        Log.d(ContentValues.TAG, "drive: Petrol Engine Started $horsePower and capacity $capacity")
    }
}