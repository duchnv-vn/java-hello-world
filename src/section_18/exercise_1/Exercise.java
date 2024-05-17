package section_18.exercise_1;

import java.util.LinkedList;

public class Exercise {
    public static void main(String[] args) {
        foodNames();
    }

    public static LinkedList<String> foodNames() {
        String[] foods = { "Pizza", "Burger", "Salad", "Noodles", "Rice" };
        var foodNames = new LinkedList<String>();
        for (var food : foods) {
            foodNames.add(food);
        }

        System.out.println(foodNames);

        return foodNames;
    }

}