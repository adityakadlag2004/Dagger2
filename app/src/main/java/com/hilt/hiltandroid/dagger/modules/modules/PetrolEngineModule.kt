package com.hilt.hiltandroid.dagger.modules.modules

import com.hilt.hiltandroid.dagger.modules.engine.Engine
import com.hilt.hiltandroid.dagger.modules.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun providePetrolEngine(petrolEngine: PetrolEngine): Engine

}