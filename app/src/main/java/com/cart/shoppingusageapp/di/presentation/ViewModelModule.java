package com.cart.shoppingusageapp.di.presentation;

import androidx.lifecycle.ViewModel;

import com.cart.shoppingusageapp.networking.FetchProductListUseCase;
import com.cart.shoppingusageapp.ui.ProductListViewModel;
import com.cart.shoppingusageapp.di.ViewModelProviderFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

import javax.inject.Provider;

import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public class ViewModelModule {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @MapKey
    @interface ViewModelKey {
        Class<? extends ViewModel> value();
    }

    @Provides
    ViewModelProviderFactory viewModelFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> providerMap) {
        return new ViewModelProviderFactory(providerMap);
    }

    @Provides
    @IntoMap
    @ViewModelKey(ProductListViewModel.class)
    ViewModel questionDetailsViewModel(FetchProductListUseCase fetchProductListUseCase) {
        return new ProductListViewModel(fetchProductListUseCase);
    }
}

