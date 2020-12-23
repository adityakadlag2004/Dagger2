// Generated by Dagger (https://dagger.dev).
package com.hilt.hiltandroid.dagger.modules.car;

import com.hilt.hiltandroid.dagger.modules.engine.Engine;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Car_Factory implements Factory<Car> {
  private final Provider<Engine> engineProvider;

  private final Provider<Wheels> wheelsProvider;

  private final Provider<Remote> remoteProvider;

  public Car_Factory(Provider<Engine> engineProvider, Provider<Wheels> wheelsProvider,
      Provider<Remote> remoteProvider) {
    this.engineProvider = engineProvider;
    this.wheelsProvider = wheelsProvider;
    this.remoteProvider = remoteProvider;
  }

  @Override
  public Car get() {
    Car instance = newInstance(engineProvider.get(), wheelsProvider.get());
    Car_MembersInjector.injectEnableRemote(instance, remoteProvider.get());
    return instance;
  }

  public static Car_Factory create(Provider<Engine> engineProvider, Provider<Wheels> wheelsProvider,
      Provider<Remote> remoteProvider) {
    return new Car_Factory(engineProvider, wheelsProvider, remoteProvider);
  }

  public static Car newInstance(Engine engine, Wheels wheels) {
    return new Car(engine, wheels);
  }
}
