package com.cart.shoppingusageapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.List;

public class ProductSchema {

    public LinkedTreeMap<String, String> getMap() {
        return map;
    }

    public void setMap(LinkedTreeMap<String, String> map) {
        this.map = map;
    }

    @SerializedName("objects")
    @Expose
    LinkedTreeMap<String ,String> map = new LinkedTreeMap<>();


}
