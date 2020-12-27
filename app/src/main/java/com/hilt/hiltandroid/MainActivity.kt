package com.hilt.hiltandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.hiltandroid.dagger2.car.Car
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
        val appcomponent = (application as MyApplication).getAppComponentApp()
            .getActivityComponentFactory()
            .create(231, 4532)


        appcomponent?.inject(this)

        car1.drive()
        car2.drive()
    }
}



