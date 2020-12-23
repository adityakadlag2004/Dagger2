package com.hilt.hiltandroid.dagger.modules.modules

import com.hilt.hiltandroid.dagger.modules.engine.DieselEngine
import com.hilt.hiltandroid.dagger.modules.engine.Engine
import dagger.Module
import dagger.Provides


@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

    @Provides
    fun provideHorsePower():Int
    {
      return horsePower
    }
}