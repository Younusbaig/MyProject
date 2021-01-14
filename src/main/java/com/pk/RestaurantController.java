package com.pk;

import java.util.List;

public class RestaurantController {

    RestaurantService service;

    public RestaurantController(final RestaurantService service) {
        this.service = service;
    }

    public boolean handleRestaurant(Restaurant restaurant) {

        System.out.println("inside Controller");

        if (restaurant.getCuisineType() == null || restaurant.getPunchOrder() == null || restaurant.getBranch() == null
                || restaurant.getRestaurantType() == null || restaurant.getRestaurantName() == null ) {
            return false;
        }

        service.RestaurantProcess(restaurant);

        return true;
    }

    public List<Restaurant> getRestaurants() {
        return service.getRestaurants();
    }


    public Restaurant getRestaurantByName(String key) {
        return service.getRestaurantByName(key);
    }

    public void deleteRestaurant(String key) {
        service.deleteRestaurant(key);

    }


}

@FunctionalInterface
interface A {
    int method();
     default int methodA(){
        return 0;
    }

    static int methodB(){
         return 0;
    }
}
