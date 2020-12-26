package com.hilt.hiltandroid.dagger2.modules

import com.hilt.hiltandroid.dagger2.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
 class DriverModule {

    @Provides
    @Singleton
    fun provideDriver():Driver
    {
       return Driver()
    }
}