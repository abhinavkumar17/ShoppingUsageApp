package com.cart.shoppingusageapp.model.prod;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product implements Parcelable {

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

    protected Product(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

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
