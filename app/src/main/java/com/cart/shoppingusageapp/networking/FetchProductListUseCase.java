package com.cart.shoppingusageapp.networking;

import android.util.Log;

import androidx.annotation.Nullable;

import com.cart.shoppingusageapp.baseview.BaseObservable;
import com.cart.shoppingusageapp.model.Product;
import com.cart.shoppingusageapp.model.ProductSchema;
import com.cart.shoppingusageapp.model.Products;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.observers.DisposableSingleObserver;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchProductListUseCase extends BaseObservable<FetchProductListUseCase.Listener> {

    public interface Listener {

        void onFetchProductSecessAndNotify(List<Product> products);

        void onFetchProductFailAndNotify();
    }

    @Nullable
    Call<Product> mCall;
    private ShoppingService mShoppingService;

    public FetchProductListUseCase(ShoppingService shoppingService) {
        mShoppingService = shoppingService;
    }

    Products products;

    public DisposableSingleObserver<List<Product>> fetchProductList() {
        mShoppingService.getProductList().enqueue(new Callback<ProductSchema>() {
            @Override
            public void onResponse(Call<ProductSchema> call, Response<ProductSchema> response) {
                Log.d("",""+response.body());
            }

            @Override
            public void onFailure(Call<ProductSchema> call, Throwable t) {
                Log.d("","");
            }
        });
        return null;
    }
}
