package org.exercise;
import java.util.Arrays;

public class MyFavouriteFood {
    public static void main(String[] args) {
        String[] foods = {"pane", "pizza", "carne", "dolce", "pasta", "verdure"};
        System.out.println(Arrays.toString(foods));
        String top = foods[0];
        String low = foods[foods.length - 1];
        String mid = foods[foods.length / 2 ];

        System.out.println("your favourites foods are: " + foods.length);
        System.out.println("you prefer: " + top);
        System.out.println("you like least: " + low);
        System.out.println("your average choice is: " + mid);
    }
}