package day09;

import java.util.Scanner;

public class InputWithScanner {
    public static void main(String[] args) {
        // Klavyeden girilen iki tamsayının toplamının buldurup, ekrana yazdıran bir java programını yazınız.
        Scanner klavyeGirdisi = new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int sayi1 = klavyeGirdisi.nextInt();

        System.out.print("İkinci Sayı : ");
        int sayi2 = klavyeGirdisi.nextInt();

        int toplam = sayi2 + sayi1;
        System.out.println("Girilen sayıların toplamı = " + toplam);

    }
}
