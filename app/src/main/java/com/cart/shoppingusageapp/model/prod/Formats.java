package com.cart.shoppingusageapp.model.prod;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Formats {

    @SerializedName("P5")
    @Expose
    private P5 p5;
    @SerializedName("P2")
    @Expose
    private P2 p2;
    @SerializedName("P0")
    @Expose
    private P0 p0;
    @SerializedName("P8")
    @Expose
    private P8 p8;
    @SerializedName("P1")
    @Expose
    private P1 p1;
    @SerializedName("P7")
    @Expose
    private P7 p7;
    @SerializedName("P4")
    @Expose
    private P4 p4;
    @SerializedName("P6")
    @Expose
    private P6 p6;

    /**
     * No args constructor for use in serialization
     *
     */
    public Formats() {
    }

    /**
     *
     * @param p0
     * @param p1
     * @param p2
     * @param p4
     * @param p5
     * @param p6
     * @param p7
     * @param p8
     */
    public Formats(P5 p5, P2 p2, P0 p0, P8 p8, P1 p1, P7 p7, P4 p4, P6 p6) {
        super();
        this.p5 = p5;
        this.p2 = p2;
        this.p0 = p0;
        this.p8 = p8;
        this.p1 = p1;
        this.p7 = p7;
        this.p4 = p4;
        this.p6 = p6;
    }

    public P5 getP5() {
        return p5;
    }

    public void setP5(P5 p5) {
        this.p5 = p5;
    }

    public Formats withP5(P5 p5) {
        this.p5 = p5;
        return this;
    }

    public P2 getP2() {
        return p2;
    }

    public void setP2(P2 p2) {
        this.p2 = p2;
    }

    public Formats withP2(P2 p2) {
        this.p2 = p2;
        return this;
    }

    public P0 getP0() {
        return p0;
    }

    public void setP0(P0 p0) {
        this.p0 = p0;
    }

    public Formats withP0(P0 p0) {
        this.p0 = p0;
        return this;
    }

    public P8 getP8() {
        return p8;
    }

    public void setP8(P8 p8) {
        this.p8 = p8;
    }

    public Formats withP8(P8 p8) {
        this.p8 = p8;
        return this;
    }

    public P1 getP1() {
        return p1;
    }

    public void setP1(P1 p1) {
        this.p1 = p1;
    }

    public Formats withP1(P1 p1) {
        this.p1 = p1;
        return this;
    }

    public P7 getP7() {
        return p7;
    }

    public void setP7(P7 p7) {
        this.p7 = p7;
    }

    public Formats withP7(P7 p7) {
        this.p7 = p7;
        return this;
    }

    public P4 getP4() {
        return p4;
    }

    public void setP4(P4 p4) {
        this.p4 = p4;
    }

    public Formats withP4(P4 p4) {
        this.p4 = p4;
        return this;
    }

    public P6 getP6() {
        return p6;
    }

    public void setP6(P6 p6) {
        this.p6 = p6;
    }

    public Formats withP6(P6 p6) {
        this.p6 = p6;
        return this;
    }

}
