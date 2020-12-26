package com.hilt.hiltandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.hiltandroid.dagger2.car.Car
import com.hilt.hiltandroid.dagger2.modules.DieselEngineModule
import com.hilt.hiltandroid.dagger2.modules.MyApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ActivityComponent = (application as MyApplication).getActivityComponent2()
            .getActivityComponent(DieselEngineModule(243))

        ActivityComponent.inject(this)

        car1.drive()
        car2.drive()
    }
}



