package com.hilt.hiltandroid.dagger.modules.modules

import android.content.ContentValues.TAG
import android.util.Log
import com.hilt.hiltandroid.dagger.modules.car.Rims
import com.hilt.hiltandroid.dagger.modules.car.Tyres
import com.hilt.hiltandroid.dagger.modules.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    companion object {
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTyres(): Tyres {
            Log.d(TAG, "drive:${Tyres().inflate()} ")
            return Tyres()
        }

        @Provides
        fun provideWheels(rims: Rims, tyres: Tyres): Wheels {
            return Wheels(rims, tyres)
        }
    }

}