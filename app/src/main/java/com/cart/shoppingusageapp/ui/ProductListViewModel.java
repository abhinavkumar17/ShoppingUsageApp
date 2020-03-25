package com.cart.shoppingusageapp.ui;

import androidx.lifecycle.ViewModel;

import com.cart.shoppingusageapp.model.Product;
import com.cart.shoppingusageapp.networking.FetchProductListUseCase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

public class ProductListViewModel extends ViewModel implements FetchProductListUseCase.Listener {

    public interface Listener {

        void onFetchProductSecessAndNotify(List<Product> products);

        void onFetchProductFailAndNotify();
    }

    private FetchProductListUseCase mFetchProductListUseCase;

    private Set<Listener> mListeners = new HashSet<>();

    @Inject
    public ProductListViewModel(FetchProductListUseCase fetchProductListUseCase) {
        mFetchProductListUseCase = fetchProductListUseCase;
    }

    public void registerViewModel() {
        mFetchProductListUseCase.registerListener(this);
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        mFetchProductListUseCase.unregisterListener(this);
    }

    public void fetchProductList() {
        mFetchProductListUseCase.fetchProductList();
    }

    public void registerListener(Listener listener) {
        mListeners.add(listener);
    }

    public void unregisterListener(Listener listener) {
        mListeners.remove(listener);
    }

    @Override
    public void onFetchProductSecessAndNotify(List<Product> products) {
        for (Listener listener : mListeners) {
            listener.onFetchProductSecessAndNotify(products);
        }
    }

    @Override
    public void onFetchProductFailAndNotify() {
        for (Listener listener : mListeners) {
            listener.onFetchProductFailAndNotify();
        }
    }
}
