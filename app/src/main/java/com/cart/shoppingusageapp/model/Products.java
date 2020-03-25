package com.cart.shoppingusageapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Products {

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @SerializedName("objects")
    @Expose
    List<Product> products = new ArrayList<Product>();

}
