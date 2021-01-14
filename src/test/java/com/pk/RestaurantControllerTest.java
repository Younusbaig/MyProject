package com.pk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantControllerTest {
    RestaurantRepository restaurantRepository = new RestaurantRepository();
    RestaurantService restaurantService =new RestaurantService(restaurantRepository);
    RestaurantController controller = new RestaurantController(restaurantService);

    @Test
    public void ShouldAcceptRestaurant(){

        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");

        boolean flag = controller.handleRestaurant(restaurant1);
        Assertions.assertTrue(flag);


    }

    @Test
    public void ShouldAcceptRestaurant1(){

        Restaurant restaurant1 = new Restaurant(null , RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");

        boolean flag = controller.handleRestaurant(restaurant1);
        Assertions.assertFalse(flag);


    }



}