package com.tests.mvpdaggerrxjava;

import android.app.Application;

import com.tests.mvpdaggerrxjava.common.net.DaggerNetComponent;
import com.tests.mvpdaggerrxjava.common.net.NetComponent;
import com.tests.mvpdaggerrxjava.common.net.NetModule;

/**
 * Created 27/06/2017.
 */

public class TestApplication extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .netModule(new NetModule("https://api.stackexchange.com/2.2/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
