package com.tests.mvpdaggerrxjava;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created 27/06/2017.
 */

@Module
public final class ApplicationModule {
    private final Context mContext;

    ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
