package com.hilt.hiltandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilt.hiltandroid.dagger2.car.Car
import com.hilt.hiltandroid.dagger2.components.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private var carComponent = DaggerCarComponent.builder()
        .horsePower(3231)
        .capacity(452)
        .build()
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carComponent.inject(this)
        car.drive()
    }
}



