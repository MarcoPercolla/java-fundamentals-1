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

        for (String guest : guests) {
            if (name.equals(guest)) {
                check = true;
                break;
            }


        }

        if (check) {
            System.out.println("you are welcome");
        }else{
            System.out.println("you are not welcome");
        }
    }
}
