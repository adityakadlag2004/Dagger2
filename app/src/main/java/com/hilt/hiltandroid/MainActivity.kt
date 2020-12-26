package com.hilt.hiltandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.hiltandroid.dagger2.car.Car
import com.hilt.hiltandroid.dagger2.components.DaggerActivityComponent
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
        val carComponent = DaggerActivityComponent.builder()
            .capacity(321)
            ?.horsePower(3123)
            ?.appComponent((application as MyApplication).getAppComponent())

       // carComponent.inject(this)
//        car1.drive()
//        car2.drive()
    }
}



