package day15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Write a Java program:
        1) Declare a variable and initialize user age.
        2) Then the program will show if the user is eligible to vote. A Person who is eligible to vote
        must be older tan or equal to 18 years old.
         */

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        if (age >= 18) {
//            System.out.println("You are eligible to vote");
//        } else {
//            System.out.println("You are not eligible to vote");
//        }

        /*
        Write Java program that will accept three numbers and return the min number.
         */

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();

        int min = n1;
        if (min > n2) {
            min = n2;
        }

        if (min > n3) {
            min = n3;
        }

        System.out.println("min = " + min);


    }
}
