package day15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int i = scanner.nextInt();
        String sonuc = i % 2 == 0 ? "Çift sayıdır. " : "Tek sayıdır.";
        System.out.println("sonuc = " + sonuc);
    }
}
