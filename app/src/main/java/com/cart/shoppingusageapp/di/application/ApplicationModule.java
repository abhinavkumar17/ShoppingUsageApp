package com.cart.shoppingusageapp.di.application;

import android.app.Application;

import dagger.Module;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    /*@Provides
    FetchProductListRepository getFetchQuestionsListUseCase(ShoppingService shoppingService) {
        return new FetchProductListRepository(shoppingService);
    }*/
}
