package com.hilt.hiltandroid.dagger2.components

import com.hilt.hiltandroid.dagger2.car.Driver
import com.hilt.hiltandroid.dagger2.modules.DieselEngineModule
import com.hilt.hiltandroid.dagger2.modules.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponent(dieselEngineModule: DieselEngineModule): ActivityComponent
}