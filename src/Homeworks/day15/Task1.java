package Homeworks.day15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int UCGEN_IC_ACILAR_TOPLAMI = 180;

        System.out.println("Üçgen geometrik şekli için açi değerlerini giriniz.");
        System.out.print("A açısı: ");
        int a = scanner.nextInt();

        System.out.print("B açısı: ");
        int b = scanner.nextInt();

        System.out.print("C açısı: ");
        int c = scanner.nextInt();

        int acilarToplami = a+b+c;
        if (acilarToplami ==UCGEN_IC_ACILAR_TOPLAMI){
            System.out.println("Bu şekil üçgendir.");
        }else {
            System.out.println("Bu şekil bir üçgen değildir");
        }


    }
}
