package module_3.enums.task2;

import java.util.ArrayList;

public class FoodDemo {
    public static void main(String[] args) {
        Food[] foods = new Food[]{
                new Fish(),
                new Nut(),
                new Vegetable(),
        };
        System.out.println(isVegetarian(foods));
    }

    static boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if (!food.getFoodType().isVeggi()) {
                return false;
            }
        }
        return true;
    }
}
