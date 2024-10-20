package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.*;
import java.util.stream.Collectors;

class Dish {
    String name;
    float price;
    float ratings;
    float calories;
    Type typeOfDish;

    // Constructor
    public Dish(String name, float price, float ratings, float calories, Type typeOfDish) {
        this.name = name;
        this.price = price;
        this.ratings = ratings;
        this.calories = calories;
        this.typeOfDish = typeOfDish;
    }

    // Enum Type
    public enum Type {
        VEG, NONVEG
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getRatings() {
        return ratings;
    }

    public float getCalories() {
        return calories;
    }

    public Type getTypeOfDish() {
        return typeOfDish;
    }
}

public class GroupOfDishes {
    public static void main(String[] args) {
        {
            // Sample list of dishes
            List<Dish> menu = Arrays.asList(
                    new Dish("Salad", 150.0f, 4.5f, 200.0f, Dish.Type.VEG),
                    new Dish("Burger", 300.0f, 3.5f, 500.0f, Dish.Type.NONVEG),
                    new Dish("Fries", 120.0f, 4.0f, 350.0f, Dish.Type.VEG),
                    new Dish("Pasta", 200.0f, 4.5f, 400.0f, Dish.Type.VEG),
                    new Dish("Pizza", 250.0f, 5.0f, 300.0f, Dish.Type.VEG));

            // Stream to filter and group dishes
            Map<Float, List<Dish>> groupedDishes = menu.stream()
                    .filter(dish -> dish.getTypeOfDish() == Dish.Type.VEG)
                    .filter(dish -> dish.getCalories() < 400)
                    .filter(dish -> dish.getRatings() >= 4.0f)
                .collect(Collectors.groupingBy(Dish::getRatings));

            // Print the grouped dishes
            groupedDishes.forEach((rating, dishes) -> {
                System.out.println("Rating: " + rating);
                dishes.forEach(dish -> System.out.println(" - " + dish.getName()));
            });

            Map<Dish.Type, Map<Float, Double>> groupedCalories = menu.stream()
                    .collect(Collectors.groupingBy(Dish::getTypeOfDish, // First group by type (VEG/NONVEG)
                            Collectors.groupingBy(Dish::getRatings,  // Then group by ratings
                                    Collectors.summingDouble(Dish::getCalories) // Sum the calories for each group
                            )));

            // Print the grouped calories
            groupedCalories.forEach((type, ratingMap) -> {
                System.out.println("Type: " + type);
                ratingMap.forEach((rating, totalCalories) -> {
                    System.out.println(" - Rating: " + rating + ", Total Calories: " + totalCalories);
                });
            });
            Map<Dish.Type, List<Dish>> groupedDishesType = menu.stream().collect(Collectors.groupingBy(Dish::getTypeOfDish));
        }
    }
}

