package com.cart.shoppingusageapp.ui.productlist;

import com.cart.shoppingusageapp.baseview.ObservableView;
import com.cart.shoppingusageapp.model.prod.Product;
import com.cart.shoppingusageapp.model.prod.Object;

import java.util.List;

public interface ProductListView extends ObservableView<ProductListView.Listener> {

    interface Listener {
        void onProductItemClick(Object product);
    }

    void showProgressIndication();
    void hideProgressIndication();
    void bindProductData(List<Object> products);
    void setServerError();
}
