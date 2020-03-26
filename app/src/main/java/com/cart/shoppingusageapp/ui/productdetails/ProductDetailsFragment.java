package com.cart.shoppingusageapp.ui.productdetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cart.shoppingusageapp.baseview.BaseFragment;
import com.cart.shoppingusageapp.baseview.ViewFactory;
import com.cart.shoppingusageapp.model.prod.Object;

import javax.inject.Inject;

public class ProductDetailsFragment extends BaseFragment implements ProductDetailsView.Listener {

    private static final String PRODUCT_EXTRA = "product";
    private Object mProduct;
    private ProductDetailsView mProductDetailsView;

    @Inject
    ViewFactory mViewFactory;

    public static ProductDetailsFragment newInstance(Object product) {
        ProductDetailsFragment fragment = new ProductDetailsFragment();
        if (product != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(PRODUCT_EXTRA, product);
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mProduct = getArguments() != null && getArguments().containsKey(PRODUCT_EXTRA) ? getArguments().getParcelable(PRODUCT_EXTRA) : null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getPresentationComponent().inject(this);
        mProductDetailsView = mViewFactory.newInstance(ProductDetailsView.class, container);
        return mProductDetailsView.getRootView();
    }

    @Override
    public void onStart() {
        super.onStart();
        mProductDetailsView.registerListener(this);
        mProductDetailsView.setProductDetailData(mProduct);
    }

    @Override
    public void onStop() {
        super.onStop();
        mProductDetailsView.unregisterListener(this);
    }
}
