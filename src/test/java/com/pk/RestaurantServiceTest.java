package com.pk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class RestaurantServiceTest {
    RestaurantRepository restaurantRepository = new RestaurantRepository();
    RestaurantService service = new RestaurantService(restaurantRepository);


    @Test
    public void ShouldSaveRestaurant() {
        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        service.RestaurantProcess(restaurant1);

    }

    @Test
    public void getByNameRestaurant() {
        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        service.RestaurantProcess(restaurant1);


        Restaurant result = service.getRestaurantByName(restaurant1.getRestaurantName());
        Assertions.assertEquals(result.getRestaurantName(), restaurant1.getRestaurantName());

    }


    @Test
    public void ShouldReturnNull() {
        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        service.RestaurantProcess(restaurant1);


        Restaurant result = service.getRestaurantByName("xyz");
        Assertions.assertNull(result);
    }
    @Test
    public void PerformDeletionShouldReturnNull(){
        Restaurant restaurant1 = new Restaurant("xxx", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        service.RestaurantProcess(restaurant1);
        Restaurant save = service.getRestaurantByName(restaurant1.getRestaurantName());
        Assertions.assertEquals(save.getRestaurantName(),restaurant1.getRestaurantName());

        service.deleteRestaurant(restaurant1.getRestaurantName());

        Restaurant del = service.getRestaurantByName(restaurant1.getRestaurantName());

        Assertions.assertNull(del);

    }


}