package com.tests.mvpdaggerrxjava.common.net;

import com.tests.mvpdaggerrxjava.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created 29/06/2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
