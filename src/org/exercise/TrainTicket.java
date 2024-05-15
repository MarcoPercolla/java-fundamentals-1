package org.exercise;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of km: ");
        int km = Integer.parseInt(scanner.nextLine());
        System.out.println("km: " + km);
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Age: " + age);

        double price = (double)km * 0.21;
        if(age < 18 ){
            price -= price * 0.20;
        } else if (age >= 65) {
            price -= price * 0.40;
        }
        System.out.println("your ticket costs: " + price + "€");
        scanner.close();
    }


}
