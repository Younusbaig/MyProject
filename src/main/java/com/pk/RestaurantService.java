package com.pk;

import java.util.List;

public class RestaurantService {

    RestaurantRepository repo;

    public RestaurantService(final RestaurantRepository repo) {
        this.repo = repo;
    }

    public void RestaurantProcess(Restaurant restaurant) {
        System.out.println("Restaurant service");
        repo.save(restaurant);

    }

    public List<Restaurant> getRestaurants() {
        return repo.getRestaurants();
    }

    public Restaurant getRestaurantByName(String key) {
        return repo.getRestaurantByName(key);
    }

    public void deleteRestaurant(String key) {
        repo.deleteRestaurant(key);

    }
}
