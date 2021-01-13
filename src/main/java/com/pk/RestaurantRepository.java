package com.pk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRepository {


    Map<String, Restaurant> restaurants = new HashMap<>();


    public void save(Restaurant restaurant) {
        System.out.println("inside repo ");
        restaurants.put(restaurant.getRestaurantName(), restaurant);
    }

    public List<Restaurant> getRestaurants() {
        return new ArrayList<>(restaurants.values());
    }

    public Restaurant getRestaurantByName(String key) {
        return restaurants.get(key);

    }

    public void deleteRestaurant(String key) {
        restaurants.remove(key);

    }
}
