package Homeworks.day15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
         * Alan ve çevre hesaplama
         * 1. Kare
         * 2. Daire
         * Seçiminiz:
         *
         * Yukarıdaki menüyü tasarlayınız.
         * Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazınız.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("-".repeat(20));
        System.out.println("Alan ve çevre hesaplama");
        System.out.println("1. Kare");
        System.out.println("2. Kare");
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();
        if (secim == 1) {
            System.out.print("Lütfen Yarıçap uzunluğu giriniz: ");
            int yaricap = scanner.nextInt();
            daireAlanVeCevre(yaricap);
        } else if (secim == 2) {
            //TODO else if devam etcen güzelke devamke YEEEEEEEEEEEEEEE
        }


    }

    public static void daireAlanVeCevre(int r) {

        double daireAlan = Math.PI * Math.pow(r, 2);
        double daireCevre = Math.PI * r * 2;
        System.out.printf("Dairenin Çevresi = %5.2f\n", daireCevre);

        System.out.printf("Dairenin Alanı = %5.2f\n", daireAlan);
    }
}
