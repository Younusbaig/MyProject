package com.pk;

public class Restaurant {

private String RestaurantName;
private RestaurantType restaurantType;
private CuisineType cuisineType;
private String branch;
private String PunchOrder;


    public Restaurant(final String restaurantName, final RestaurantType restaurantType, final CuisineType cuisineType, final String branch, final String punchOrder) {
        RestaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.cuisineType = cuisineType;
        this.branch =branch;
        PunchOrder = punchOrder;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public RestaurantType getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(RestaurantType restaurantType) {
        this.restaurantType = restaurantType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPunchOrder() {
        return PunchOrder;
    }

    public void setPunchOrder(String punchOrder) {
        PunchOrder = punchOrder;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "RestaurantName='" + RestaurantName + '\'' +
                ", restaurantType=" + restaurantType +
                ", cuisineType=" + cuisineType +
                ", branch='" + branch + '\'' +
                ", PunchOrder='" + PunchOrder + '\'' +
                '}';
    }
}




