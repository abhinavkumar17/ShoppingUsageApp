package com.cart.shoppingusageapp.di.application;

import android.app.Application;

import com.cart.shoppingusageapp.networking.FetchProductListUseCase;
import com.cart.shoppingusageapp.networking.ShoppingService;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    /*@Provides
    FetchProductListUseCase getFetchQuestionsListUseCase(ShoppingService shoppingService) {
        return new FetchProductListUseCase(shoppingService);
    }*/
}
