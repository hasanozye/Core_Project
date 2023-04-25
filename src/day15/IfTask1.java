package day15;

import java.util.Scanner;

public class IfTask1 {
    public static void main(String[] args) {
        double n1 = 7.8;
        double n2 = 5.3;
        System.out.println(Math.max(n1, n2) + " Sayısı daha büyüktür.");

        /*
        Klavyeden value al
        Dispaly wheter the number is an odd number or even number.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Declare and initialize a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Your Number is even!");
        }else {
            System.out.println("Your number is odd!");
        }

    }
}
