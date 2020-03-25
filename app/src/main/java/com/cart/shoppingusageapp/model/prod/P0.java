package com.cart.shoppingusageapp.model.prod;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class P0 {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("width")
    @Expose
    private int width;

    /**
     * No args constructor for use in serialization
     *
     */
    public P0() {
    }

    /**
     *
     * @param width
     * @param url
     * @param height
     */
    public P0(String url, int height, int width) {
        super();
        this.url = url;
        this.height = height;
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public P0 withUrl(String url) {
        this.url = url;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public P0 withHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public P0 withWidth(int width) {
        this.width = width;
        return this;
    }

}
