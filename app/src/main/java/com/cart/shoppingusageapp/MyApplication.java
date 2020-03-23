package com.cart.shoppingusageapp;

import android.app.Application;

import com.cart.shoppingusageapp.di.application.ApplicationComponent;

public class MyApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = null;
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}
