package com.hilt.hiltandroid.dagger2.components

import com.hilt.hiltandroid.MainActivity
import com.hilt.hiltandroid.dagger2.PerActivity
import com.hilt.hiltandroid.dagger2.car.Car
import com.hilt.hiltandroid.dagger2.modules.DieselEngineModule
import com.hilt.hiltandroid.dagger2.modules.PetrolEngineModule
import com.hilt.hiltandroid.dagger2.modules.WheelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named


@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {
    val car: Car?

    fun inject(mainActivity: MainActivity?): Unit


//    @Subcomponent.Builder
//    interface Builder {
//        @BindsInstance
//        fun horsePower(@Named("horsepower") horsePower: Int): Builder?
//
//        @BindsInstance
//        fun capacity(@Named("capacity") engineCapacity: Int): Builder?
//
//
//        fun build(): ActivityComponent?
//
//
//    }

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horsepower") horsePower: Int,
            @BindsInstance @Named("capacity") engineCapacity: Int
        ): ActivityComponent?


    }
}