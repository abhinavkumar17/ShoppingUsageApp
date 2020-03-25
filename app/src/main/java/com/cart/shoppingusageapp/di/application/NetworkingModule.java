package com.cart.shoppingusageapp.di.application;

import com.cart.shoppingusageapp.Constants;
import com.cart.shoppingusageapp.networking.ShoppingService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkingModule {

    @Singleton
    @Provides
    Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    ShoppingService getShoppingService(Retrofit retrofit) {
        return retrofit.create(ShoppingService.class);
    }
}