package com.cart.shoppingusageapp.model.prod;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserData {

    @SerializedName("id")
    @Expose
    private int id;

    /**
     * No args constructor for use in serialization
     */
    public UserData() {
    }

    /**
     * @param id
     */
    public UserData(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserData withId(int id) {
        this.id = id;
        return this;
    }
}

