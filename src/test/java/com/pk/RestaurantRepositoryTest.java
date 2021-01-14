package com.pk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantRepositoryTest {

    RestaurantRepository repository = new RestaurantRepository();

    @Test
    public void SaveInRepository() {
        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        repository.save(restaurant1);

    }

    @Test
    public void CheckDelete(){
        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        repository.save(restaurant1);
        repository.deleteRestaurant(restaurant1.getRestaurantName());


    }
 @Test
    public void checkEquals(){
        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        repository.save(restaurant1);
        Restaurant save = repository.getRestaurantByName(restaurant1.getRestaurantName());
        Assertions.assertEquals(save.getRestaurantName(), restaurant1.getRestaurantName() );

    }





}