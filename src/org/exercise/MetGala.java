package org.exercise;
import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        String[] guests = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("submit your name: ");
        String name = (scanner.nextLine());
        System.out.println("you are: " + name);
        boolean check = false;

        for (int i = 0; i < guests.length ; i++) {
            if (name.equals(guests[i])) {
                check = true;
            };

        }

        if (check == true) {
            System.out.println("you are welcome");
        }else{
            System.out.println("you are not welcome");
        }
    }
}
