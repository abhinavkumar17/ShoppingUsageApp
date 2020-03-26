package com.cart.shoppingusageapp.ui.productlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.cart.shoppingusageapp.R;
import com.cart.shoppingusageapp.baseview.BaseFragment;
import com.cart.shoppingusageapp.baseview.ViewFactory;
import com.cart.shoppingusageapp.di.ViewModelProviderFactory;
import com.cart.shoppingusageapp.model.prod.Object;
import com.cart.shoppingusageapp.ui.productdetails.ProductDetailsFragment;

import java.util.List;

import javax.inject.Inject;

public class ProductListFragment extends BaseFragment implements ProductListView.Listener,
        ProductListViewModel.Listener {

    @Inject
    ViewFactory mViewFactory;

    @Inject
    ViewModelProviderFactory mViewModelProviderFactory;


    private ProductListView mProductListView;

    private ProductListViewModel mProductListViewModel;

    private List<Object> mProcucts;

    public static ProductListFragment newInstance() {
        ProductListFragment fragment = new ProductListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getPresentationComponent().inject(this);
        mProductListView = mViewFactory.newInstance(ProductListView.class, container);
        mProductListViewModel = ViewModelProviders.of(this, mViewModelProviderFactory).get(ProductListViewModel.class);
        return mProductListView.getRootView();
    }

    @Override
    public void onStart() {
        super.onStart();
        mProductListView.registerListener(this);
        mProductListViewModel.registerViewModel();
        mProductListViewModel.registerListener(this);
        mProductListView.showProgressIndication();
        getProductListData();
    }

    private void getProductListData() {
        mProductListViewModel.fetchProductList();
    }

    @Override
    public void onStop() {
        super.onStop();
        mProductListView.unregisterListener(this);
        mProductListViewModel.unregisterListener(this);
    }

    @Override
    public void onFetchProductSecessAndNotify(List<Object> products) {
        mProcucts = products;
        mProductListView.hideProgressIndication();
        mProductListView.bindProductData(mProcucts);
    }

    @Override
    public void onFetchProductFailAndNotify() {
        mProductListView.hideProgressIndication();
        mProductListView.setServerError();
    }

    @Override
    public void onProductItemClick(Object product) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.screenContainer, ProductDetailsFragment.newInstance(product));
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
