package com.cart.shoppingusageapp.ui.productdetails;

import com.cart.shoppingusageapp.baseview.ObservableView;
import com.cart.shoppingusageapp.model.prod.Object;
import com.cart.shoppingusageapp.model.prod.Product;

public interface ProductDetailsView extends ObservableView<ProductDetailsView.Listener> {

    public interface Listener {
    }

    void setProductDetailData(Object mProduct);
}
