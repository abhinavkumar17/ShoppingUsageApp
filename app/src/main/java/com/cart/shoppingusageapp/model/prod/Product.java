package com.cart.shoppingusageapp.model.prod;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("objects")
    @Expose
    private List<Object> products = null;

    /**
     *
     * @param products
     */
    public Product(List<Object> products) {
        super();
        this.products = products;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }

    public Product withObjects(List<Object> products) {
        this.products = products;
        return this;
    }

}
