package com.hilt.hiltandroid.dagger2.components

import com.hilt.hiltandroid.MainActivity
import com.hilt.hiltandroid.dagger2.PerActivity
import com.hilt.hiltandroid.dagger2.car.Car
import com.hilt.hiltandroid.dagger2.modules.PetrolEngineModule
import com.hilt.hiltandroid.dagger2.modules.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named


@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {
    val car: Car?

    fun inject(mainActivity: MainActivity?)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horsepower") horsePower: Int): Builder?

        @BindsInstance
        fun capacity(@Named("capacity") engineCapacity: Int): Builder?
        fun appComponent(component: AppComponent?): Builder?
        fun build(): ActivityComponent?
    }
}