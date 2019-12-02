package com.thanakrit.tigerfoodnative;

public class Restaurent {

    public static final String Field_address = "address";
    public static final String Field_category = "category";
    public static final String Field_price = "price";
    public static final String Field_rateing = "rating";

    private String name;
    private String address;
    private String category;
    private String resUrl;
    private int price;
    private double rating;


    public Restaurent(String name, String address, String category, String resUrl, int price, double rating) {
        this.name = name;
        this.address = address;
        this.category = category;
        this.resUrl = resUrl;
        this.price = price;
        this.rating = rating;
    }

    public static String getField_address() {
        return Field_address;
    }

    public static String getField_category() {
        return Field_category;
    }

    public static String getField_price() {
        return Field_price;
    }

    public static String getField_rateing() {
        return Field_rateing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
