package com.cart.shoppingusageapp.ui.productlist;

import androidx.lifecycle.ViewModel;

import com.cart.shoppingusageapp.model.prod.Object;
import com.cart.shoppingusageapp.networking.FetchProductListRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

public class ProductListViewModel extends ViewModel implements FetchProductListRepository.Listener {

    public interface Listener {

        void onFetchProductSecessAndNotify(List<Object> products);

        void onFetchProductFailAndNotify();
    }

    private FetchProductListRepository mFetchProductListRepository;

    private Set<Listener> mListeners = new HashSet<>();

    @Inject
    public ProductListViewModel(FetchProductListRepository fetchProductListRepository) {
        mFetchProductListRepository = fetchProductListRepository;
    }

    public void registerViewModel() {
        mFetchProductListRepository.registerListener(this);
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        mFetchProductListRepository.unregisterListener(this);
    }

    public void fetchProductList() {
        mFetchProductListRepository.fetchProductList();
    }

    public void registerListener(Listener listener) {
        mListeners.add(listener);
    }

    public void unregisterListener(Listener listener) {
        mListeners.remove(listener);
    }

    @Override
    public void onFetchProductFailAndNotify() {
        for (Listener listener : mListeners) {
            listener.onFetchProductFailAndNotify();
        }
    }

    @Override
    public void onFetchProductSecessAndNotify(List<Object> products) {
        for (Listener listener : mListeners) {
            listener.onFetchProductSecessAndNotify(products);
        }
    }
}
