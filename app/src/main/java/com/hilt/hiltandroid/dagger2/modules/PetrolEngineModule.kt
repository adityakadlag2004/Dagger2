package com.hilt.hiltandroid.dagger2.modules

import com.hilt.hiltandroid.dagger2.engine.Engine
import com.hilt.hiltandroid.dagger2.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun providePetrolEngine(petrolEngine: PetrolEngine): Engine

}