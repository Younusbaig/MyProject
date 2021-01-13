package com.pk;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RestaurantTest {

    public static void main(String[] args) {









        Restaurant restaurant1 = new Restaurant("xyz", RestaurantType.Dining, CuisineType.Eastern, "Gulshan", "Yes");
        Restaurant restaurant2 = new Restaurant("bwc", RestaurantType.TakeAway, CuisineType.Eastern, "sfc", "Yes");
        Restaurant restaurant3 = new Restaurant("zzz", RestaurantType.Dining, CuisineType.pakistani, "clifton", "Yes");


        RestaurantRepository repo1 = new RestaurantRepository();
        RestaurantService ser = new RestaurantService(repo1);
        RestaurantController controller = new RestaurantController(ser);

        controller.handleRestaurant(restaurant1);
        controller.handleRestaurant(restaurant2);
        controller.handleRestaurant(restaurant3);
        //controller.deleteRestaurant("zzz");
       // Restaurant name = controller.getRestaurantByName("xyz");

        //System.out.println(name);



        List<Restaurant> restaurants = controller.getRestaurants();


          //using streams

        //restaurants.stream().forEach(a -> System.out.println(a));
         //restaurants.stream().filter(a -> a.getRestaurantType()==RestaurantType.Dining).forEach(a -> System.out.println(a));
         Optional<Restaurant> find = restaurants.stream().filter(a -> a.getPunchOrder()== "No").findFirst();
        //if (find.isPresent()){
          //  System.out.println(find.get());
        //}

        List<Restaurant> currentAccounts = restaurants.stream().filter(a -> a.getRestaurantType()== RestaurantType.TakeAway).collect(Collectors.toList());
        System.out.println(currentAccounts.size());
    }





}
