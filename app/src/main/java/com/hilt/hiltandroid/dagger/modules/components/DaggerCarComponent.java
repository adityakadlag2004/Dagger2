// Generated by Dagger (https://dagger.dev).
package com.hilt.hiltandroid.dagger.modules.components;

import com.hilt.hiltandroid.MainActivity;
import com.hilt.hiltandroid.MainActivity_MembersInjector;
import com.hilt.hiltandroid.dagger.modules.car.Car;
import com.hilt.hiltandroid.dagger.modules.car.Car_Factory;
import com.hilt.hiltandroid.dagger.modules.car.Car_MembersInjector;
import com.hilt.hiltandroid.dagger.modules.car.Remote;
import com.hilt.hiltandroid.dagger.modules.car.Wheels;
import com.hilt.hiltandroid.dagger.modules.engine.PetrolEngine;
import com.hilt.hiltandroid.dagger.modules.WheelsModule_Companion_ProvideRimsFactory;
import com.hilt.hiltandroid.dagger.modules.WheelsModule_Companion_ProvideTyresFactory;
import com.hilt.hiltandroid.dagger.modules.WheelsModule_Companion_ProvideWheelsFactory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCarComponent implements CarComponent {
  private final Integer horsePower;

  private final Integer capacity;

  private DaggerCarComponent(Integer horsePowerParam, Integer capacityParam) {
    this.horsePower = horsePowerParam;
    this.capacity = capacityParam;
  }

  public static CarComponent.Builder builder() {
    return new Builder();
  }

  private PetrolEngine getPetrolEngine() {
    return new PetrolEngine(horsePower, capacity);}

  private Wheels getWheels() {
    return WheelsModule_Companion_ProvideWheelsFactory.provideWheels(WheelsModule_Companion_ProvideRimsFactory.provideRims(), WheelsModule_Companion_ProvideTyresFactory.provideTyres());}

  @Override
  public Car getCar() {
    return injectCar(Car_Factory.newInstance(getPetrolEngine(), getWheels()));}

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);}

  private Car injectCar(Car instance) {
    Car_MembersInjector.injectEnableRemote(instance, new Remote());
    return instance;
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectCar(instance, getCar());
    return instance;
  }

  private static final class Builder implements CarComponent.Builder {
    private Integer horsePower;

    private Integer capacity;

    @Override
    public Builder horsePower(int horse) {
      this.horsePower = Preconditions.checkNotNull(horse);
      return this;
    }

    @Override
    public Builder capacity(int capacity) {
      this.capacity = Preconditions.checkNotNull(capacity);
      return this;
    }

    @Override
    public CarComponent build() {
      Preconditions.checkBuilderRequirement(horsePower, Integer.class);
      Preconditions.checkBuilderRequirement(capacity, Integer.class);
      return new DaggerCarComponent(horsePower, capacity);
    }
  }
}
