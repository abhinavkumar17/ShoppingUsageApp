package com.cart.shoppingusageapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.net.URI;
import java.util.List;

public class Product {

    @SerializedName("currency")
    @Expose
    String price_currency;

    @SerializedName("pictures")
    @Expose
    List<URI> pictures_data;

    @SerializedName("description")
    @Expose
    String description;

    @SerializedName("country")
    @Expose
    String country;

    @SerializedName("user_id")
    @Expose
    String user_id;

    @SerializedName("id")
    @Expose
    String id;

    @SerializedName("address")
    @Expose
    String address;

    @SerializedName("price")
    @Expose
    String price_amount;

    public String getPrice_currency() {
        return price_currency;
    }

    public List<URI> getPictures_data() {
        return pictures_data;
    }

    public String getDescription() {
        return description;
    }

    public String getCountry() {
        return country;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPrice_amount() {
        return price_amount;
    }

    public void setPrice_currency(String price_currency) {
        this.price_currency = price_currency;
    }

    public void setPictures_data(List<URI> pictures_data) {
        this.pictures_data = pictures_data;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice_amount(String price_amount) {
        this.price_amount = price_amount;
    }

}
