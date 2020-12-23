package com.hilt.hiltandroid.dagger.modules.components

import com.hilt.hiltandroid.dagger.modules.car.Car
import com.hilt.hiltandroid.MainActivity
import com.hilt.hiltandroid.dagger.modules.modules.PetrolEngineModule
import com.hilt.hiltandroid.dagger.modules.modules.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun horsePower(@Named("horsepower")horse:Int):Builder

        @BindsInstance
        fun capacity(@Named("capacity")capacity:Int):Builder

        fun build():CarComponent


    }
}