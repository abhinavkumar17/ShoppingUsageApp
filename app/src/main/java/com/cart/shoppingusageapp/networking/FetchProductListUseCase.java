package com.cart.shoppingusageapp.networking;

import androidx.annotation.Nullable;

import com.cart.shoppingusageapp.baseview.BaseObservable;
import com.cart.shoppingusageapp.model.prod.Object;
import com.cart.shoppingusageapp.model.prod.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchProductListUseCase extends BaseObservable<FetchProductListUseCase.Listener> {

    public interface Listener {

        void onFetchProductFailAndNotify();

        void onFetchProductSecessAndNotify(List<Object> products);

    }

    @Nullable
    Call<Product> mCall;
    private ShoppingService mShoppingService;

    public FetchProductListUseCase(ShoppingService shoppingService) {
        mShoppingService = shoppingService;
    }

    public void fetchProductList() {
        mShoppingService.getProductList().enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                for (Listener listener : getListeners()) {
                    listener.onFetchProductSecessAndNotify(response.body().getProducts());
                }
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                for (Listener listener : getListeners()) {
                    listener.onFetchProductFailAndNotify();
                }
            }
        });
    }
}
