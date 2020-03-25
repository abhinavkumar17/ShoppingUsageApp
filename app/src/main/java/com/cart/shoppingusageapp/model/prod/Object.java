package com.cart.shoppingusageapp.model.prod;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Object implements Parcelable {

    @SerializedName("price_currency")
    @Expose
    private String priceCurrency;
    @SerializedName("variant_set")
    @Expose
    private int variantSet;
    @SerializedName("pictures_data")
    @Expose
    private List<PicturesDatum> picturesData = null;
    @SerializedName("quantity")
    @Expose
    private java.lang.Object quantity;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("brand_id")
    @Expose
    private java.lang.Object brandId;
    @SerializedName("active_status")
    @Expose
    private String activeStatus;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("pub_date")
    @Expose
    private String pubDate;
    @SerializedName("national_shipping_cost")
    @Expose
    private String nationalShippingCost;
    @SerializedName("user_id")
    @Expose
    private int userId;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("hand_delivery")
    @Expose
    private boolean handDelivery;
    @SerializedName("international_shipping_cost")
    @Expose
    private java.lang.Object internationalShippingCost;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("purchase_via_paypal")
    @Expose
    private boolean purchaseViaPaypal;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("videos")
    @Expose
    private java.lang.Object videos;
    @SerializedName("user_data")
    @Expose
    private UserData userData;
    @SerializedName("variants")
    @Expose
    private Variants variants;
    @SerializedName("price_amount")
    @Expose
    private String priceAmount;

    /**
     * No args constructor for use in serialization
     *
     */
    public Object() {
    }

    /**
     *
     * @param country
     * @param quantity
     * @param address
     * @param userData
     * @param internationalShippingCost
     * @param description
     * @param videos
     * @param variants
     * @param pubDate
     * @param userId
     * @param handDelivery
     * @param priceCurrency
     * @param picturesData
     * @param createdDate
     * @param activeStatus
     * @param brandId
     * @param nationalShippingCost
     * @param variantSet
     * @param id
     * @param categories
     * @param priceAmount
     * @param slug
     * @param purchaseViaPaypal
     * @param status
     */
    public Object(String priceCurrency, int variantSet, List<PicturesDatum> picturesData, java.lang.Object quantity, String createdDate, String description, java.lang.Object brandId, String activeStatus, String country, String slug, String pubDate, String nationalShippingCost, int userId, int id, boolean handDelivery, java.lang.Object internationalShippingCost, String status, boolean purchaseViaPaypal, List<Integer> categories, String address, java.lang.Object videos, UserData userData, Variants variants, String priceAmount) {
        super();
        this.priceCurrency = priceCurrency;
        this.variantSet = variantSet;
        this.picturesData = picturesData;
        this.quantity = quantity;
        this.createdDate = createdDate;
        this.description = description;
        this.brandId = brandId;
        this.activeStatus = activeStatus;
        this.country = country;
        this.slug = slug;
        this.pubDate = pubDate;
        this.nationalShippingCost = nationalShippingCost;
        this.userId = userId;
        this.id = id;
        this.handDelivery = handDelivery;
        this.internationalShippingCost = internationalShippingCost;
        this.status = status;
        this.purchaseViaPaypal = purchaseViaPaypal;
        this.categories = categories;
        this.address = address;
        this.videos = videos;
        this.userData = userData;
        this.variants = variants;
        this.priceAmount = priceAmount;
    }

    protected Object(Parcel in) {
        priceCurrency = in.readString();
        variantSet = in.readInt();
        createdDate = in.readString();
        description = in.readString();
        activeStatus = in.readString();
        country = in.readString();
        slug = in.readString();
        pubDate = in.readString();
        nationalShippingCost = in.readString();
        userId = in.readInt();
        id = in.readInt();
        handDelivery = in.readByte() != 0;
        status = in.readString();
        purchaseViaPaypal = in.readByte() != 0;
        address = in.readString();
        priceAmount = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(priceCurrency);
        dest.writeInt(variantSet);
        dest.writeString(createdDate);
        dest.writeString(description);
        dest.writeString(activeStatus);
        dest.writeString(country);
        dest.writeString(slug);
        dest.writeString(pubDate);
        dest.writeString(nationalShippingCost);
        dest.writeInt(userId);
        dest.writeInt(id);
        dest.writeByte((byte) (handDelivery ? 1 : 0));
        dest.writeString(status);
        dest.writeByte((byte) (purchaseViaPaypal ? 1 : 0));
        dest.writeString(address);
        dest.writeString(priceAmount);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Object> CREATOR = new Creator<Object>() {
        @Override
        public Object createFromParcel(Parcel in) {
            return new Object(in);
        }

        @Override
        public Object[] newArray(int size) {
            return new Object[size];
        }
    };

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public Object withPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }

    public int getVariantSet() {
        return variantSet;
    }

    public void setVariantSet(int variantSet) {
        this.variantSet = variantSet;
    }

    public Object withVariantSet(int variantSet) {
        this.variantSet = variantSet;
        return this;
    }

    public List<PicturesDatum> getPicturesData() {
        return picturesData;
    }

    public void setPicturesData(List<PicturesDatum> picturesData) {
        this.picturesData = picturesData;
    }

    public Object withPicturesData(List<PicturesDatum> picturesData) {
        this.picturesData = picturesData;
        return this;
    }

    public java.lang.Object getQuantity() {
        return quantity;
    }

    public void setQuantity(java.lang.Object quantity) {
        this.quantity = quantity;
    }

    public Object withQuantity(java.lang.Object quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Object withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object withDescription(String description) {
        this.description = description;
        return this;
    }

    public java.lang.Object getBrandId() {
        return brandId;
    }

    public void setBrandId(java.lang.Object brandId) {
        this.brandId = brandId;
    }

    public Object withBrandId(java.lang.Object brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Object withActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Object withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public Object withPubDate(String pubDate) {
        this.pubDate = pubDate;
        return this;
    }

    public String getNationalShippingCost() {
        return nationalShippingCost;
    }

    public void setNationalShippingCost(String nationalShippingCost) {
        this.nationalShippingCost = nationalShippingCost;
    }

    public Object withNationalShippingCost(String nationalShippingCost) {
        this.nationalShippingCost = nationalShippingCost;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Object withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object withId(int id) {
        this.id = id;
        return this;
    }

    public boolean isHandDelivery() {
        return handDelivery;
    }

    public void setHandDelivery(boolean handDelivery) {
        this.handDelivery = handDelivery;
    }

    public Object withHandDelivery(boolean handDelivery) {
        this.handDelivery = handDelivery;
        return this;
    }

    public java.lang.Object getInternationalShippingCost() {
        return internationalShippingCost;
    }

    public void setInternationalShippingCost(java.lang.Object internationalShippingCost) {
        this.internationalShippingCost = internationalShippingCost;
    }

    public Object withInternationalShippingCost(java.lang.Object internationalShippingCost) {
        this.internationalShippingCost = internationalShippingCost;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object withStatus(String status) {
        this.status = status;
        return this;
    }

    public boolean isPurchaseViaPaypal() {
        return purchaseViaPaypal;
    }

    public void setPurchaseViaPaypal(boolean purchaseViaPaypal) {
        this.purchaseViaPaypal = purchaseViaPaypal;
    }

    public Object withPurchaseViaPaypal(boolean purchaseViaPaypal) {
        this.purchaseViaPaypal = purchaseViaPaypal;
        return this;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public Object withCategories(List<Integer> categories) {
        this.categories = categories;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object withAddress(String address) {
        this.address = address;
        return this;
    }

    public java.lang.Object getVideos() {
        return videos;
    }

    public void setVideos(java.lang.Object videos) {
        this.videos = videos;
    }

    public Object withVideos(java.lang.Object videos) {
        this.videos = videos;
        return this;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public Object withUserData(UserData userData) {
        this.userData = userData;
        return this;
    }

    public Variants getVariants() {
        return variants;
    }

    public void setVariants(Variants variants) {
        this.variants = variants;
    }

    public Object withVariants(Variants variants) {
        this.variants = variants;
        return this;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }

    public Object withPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
        return this;
    }

}
