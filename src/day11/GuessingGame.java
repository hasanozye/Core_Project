package day11;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int sayi = 21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("MY NAME IS GUS. BUT YOU CAN CALL ME GUSTAVO FRING.");
        System.out.print("What is your guess? ");
        int guess = scanner.nextInt();


        if (guess < sayi) {
            System.out.println("Daha büyük bir sayı giriniz.");

        } else if (guess > sayi) {
            System.out.println("Daha küçük bir sayı giriniz.");
        } else {
            System.out.println("Tebrikler! Bildiniz. ");
        }
        System.out.println("Bittiiii. ");

    }
}
