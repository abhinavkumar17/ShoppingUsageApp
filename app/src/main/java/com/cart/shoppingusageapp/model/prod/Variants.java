package com.cart.shoppingusageapp.model.prod;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variants {

    @SerializedName("3")
    @Expose
    private int _3;
    @SerializedName("9")
    @Expose
    private int _9;
    @SerializedName("12")
    @Expose
    private int _12;
    @SerializedName("4")
    @Expose
    private int _4;

    /**
     * No args constructor for use in serialization
     *
     */
    public Variants() {
    }

    /**
     *
     * @param _12
     * @param _3
     * @param _4
     * @param _9
     */
    public Variants(int _3, int _9, int _12, int _4) {
        super();
        this._3 = _3;
        this._9 = _9;
        this._12 = _12;
        this._4 = _4;
    }

    public int get3() {
        return _3;
    }

    public void set3(int _3) {
        this._3 = _3;
    }

    public Variants with3(int _3) {
        this._3 = _3;
        return this;
    }

    public int get9() {
        return _9;
    }

    public void set9(int _9) {
        this._9 = _9;
    }

    public Variants with9(int _9) {
        this._9 = _9;
        return this;
    }

    public int get12() {
        return _12;
    }

    public void set12(int _12) {
        this._12 = _12;
    }

    public Variants with12(int _12) {
        this._12 = _12;
        return this;
    }

    public int get4() {
        return _4;
    }

    public void set4(int _4) {
        this._4 = _4;
    }

    public Variants with4(int _4) {
        this._4 = _4;
        return this;
    }

}