package day11;

import java.util.Scanner;

public class RelatOrnekler {
    public static void main(String[] args) {
        /*
        Klavyeden ytaşını öğrendiğiniz bir kişiye yetişkin olup olmadığını söyleyen
        Java programını yazınız.

         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your age : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }


    }
}
