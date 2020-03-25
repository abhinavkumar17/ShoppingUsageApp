package com.cart.shoppingusageapp.model.prod;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PicturesDatum {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("formats")
    @Expose
    private Formats formats;

    /**
     * No args constructor for use in serialization
     *
     */
    public PicturesDatum() {
    }

    /**
     *
     * @param formats
     * @param id
     */
    public PicturesDatum(int id, Formats formats) {
        super();
        this.id = id;
        this.formats = formats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PicturesDatum withId(int id) {
        this.id = id;
        return this;
    }

    public Formats getFormats() {
        return formats;
    }

    public void setFormats(Formats formats) {
        this.formats = formats;
    }

    public PicturesDatum withFormats(Formats formats) {
        this.formats = formats;
        return this;
    }

}
