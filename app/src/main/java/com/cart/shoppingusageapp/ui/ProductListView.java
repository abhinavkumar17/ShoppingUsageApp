package com.cart.shoppingusageapp.ui;

import com.cart.shoppingusageapp.baseview.ObservableView;
import com.cart.shoppingusageapp.model.Product;

import java.util.List;

public interface ProductListView extends ObservableView<ProductListView.Listener> {

    interface Listener {
        void onProductItemClick(Product product);
    }

    void showProgressIndication();
    void hideProgressIndication();
    void bindProductData(List<Product> products);
    void setServerError();
}
