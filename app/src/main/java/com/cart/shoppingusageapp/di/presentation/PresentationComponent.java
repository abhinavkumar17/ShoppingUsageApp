package com.cart.shoppingusageapp.di.presentation;


import com.cart.shoppingusageapp.ui.productdetails.ProductDetailsFragment;
import com.cart.shoppingusageapp.ui.productlist.ProductListFragment;

import dagger.Subcomponent;

@Subcomponent(modules = {PresentationModule.class,ViewModelModule.class})
public interface PresentationComponent {
    void inject(ProductListFragment productListFragment);
    void inject(ProductDetailsFragment productDetailsFragment);
}
