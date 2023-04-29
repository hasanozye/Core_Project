package day15;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        /*
        Write a program to display traffic light colors using following logic:
        if code (R/r) -->"Red"
        if code (O/o) -->"Orange"
        if code (G/g) -->"Green"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("-".repeat(20));
        System.out.print("Write the first letter of traffic light color[R,O,G]: ");
        String letter = scanner.next();
        letter = letter.toLowerCase();

        switch (letter) {
            case "r":
                System.out.println("Red");
                break;
            case "o":
                System.out.println("Orange");
                break;
            case "g":
                System.out.println("Green");
                break;
        }

    }
}
