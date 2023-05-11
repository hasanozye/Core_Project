package Homeworks.day20;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        /*
         * Klavyeden 10 tane sayı okutup en büyüğünü ve en küçüğü bul
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Min-max Uygulamasına hoş geldiniz.");
        System.out.println("Lütfen 10 farklı sayı giriniz.");

        int[] sayilar = new int[10];


        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i + 1) + ". Sayı : ");
            sayilar[i] = sc.nextInt();


        }
        int min = sayilar[0];
        int max = sayilar[0];

        for (int i = 1; i < sayilar.length; i++) {
            if (min > sayilar[i]) {
                min = sayilar[i];
            }

            if (max < sayilar[i]) {
                max = sayilar[i];
            }

        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);


    }
}
