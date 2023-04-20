package day09;

import java.util.Scanner;

public class TaskWithScanner {
    public static void main(String[] args) {
        /*
        TASK: Klavyeden girilen iki sayının çarpımını bulup, ekrana yazan bir Java programı tasaralyınız.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayı: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci Sayı: ");
        int sayi2 = input.nextInt();

        int carpim = sayi2 * sayi1;
        System.out.println("Çarpım = " + carpim);


    }
}
