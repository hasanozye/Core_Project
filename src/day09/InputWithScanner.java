package day09;

import java.util.Scanner;

public class InputWithScanner {
    public static void main(String[] args) {
        // Klavyeden girilen iki tamsayının toplamının buldurup, ekrana yazdıran bir java programını yazınız.
        Scanner klavyeGirdisi = new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int sayi1 = klavyeGirdisi.nextInt();
        klavyeGirdisi.nextLine();

        System.out.print("İkinci Sayı : ");
        int sayi2 = klavyeGirdisi.nextInt();

        int toplam = sayi2 + sayi1;
        System.out.println("Girilen sayıların toplamı = " + toplam);

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);
        scan.close();

    }
}
