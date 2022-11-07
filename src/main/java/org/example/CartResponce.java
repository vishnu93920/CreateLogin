package org.example;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartResponce {
    @SerializedName("Title")
    @Expose
    private String Title;
    @SerializedName("Price")
    @Expose
    private int Price;
    @SerializedName("Brand")
    @Expose
    private String Brand;

}
