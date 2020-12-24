package com.hilt.hiltandroid.dagger2.car

import javax.inject.Inject

class Wheels
@Inject
constructor(var rims: Rims, var tyres: Tyres) {
    private val TAG = "Wheels"


}