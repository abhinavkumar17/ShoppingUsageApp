package com.cart.shoppingusageapp;

import android.app.Application;

import com.cart.shoppingusageapp.di.application.ApplicationComponent;
import com.cart.shoppingusageapp.di.application.ApplicationModule;
import com.cart.shoppingusageapp.di.application.DaggerApplicationComponent;


public class MyApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}
