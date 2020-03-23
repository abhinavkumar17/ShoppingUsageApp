package com.cart.shoppingusageapp.ui;

import com.cart.shoppingusageapp.baseview.BaseObservable;
import com.cart.shoppingusageapp.model.Product;
import com.cart.shoppingusageapp.repository.ShoppingRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.observers.DisposableSingleObserver;

public class FetchProductListUseCase extends BaseObservable<FetchProductListUseCase.Listener> {

    public interface Listener {

        void onFetchProductSecessAndNotify(List<Product> products);

        void onFetchProductFailAndNotify();
    }


    public FetchProductListUseCase() {

    }


    public DisposableSingleObserver<List<Product>> fetchProductList() {
        return null;
    }
        /*return mShoppingRepository.getProducts().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<List<Product>>() {
                    @Override
                    public void onSuccess(List<Product> products) {
                        for (Listener listener:getListeners()){
                            listener.onFetchProductSecessAndNotify(products);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("", "");
                        for (Listener listener:getListeners()){
                            listener.onFetchProductFailAndNotify();
                        }
                    }
                });
    }*/
}
