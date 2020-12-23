package com.hilt.hiltandroid.dagger.modules.car

import javax.inject.Inject

class Wheels
@Inject
constructor(var rims: Rims, var tyres: Tyres) {

}