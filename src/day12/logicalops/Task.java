package day12.logicalops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        if ((sayi % 10) == 0) {
            System.out.printf("%d, 10'a tam bölünüyor. ", sayi);
        } else {
            System.out.printf("%d, 10'a tam bölünmüyor. ", sayi);
        }


    }
    /*
        Verilen bir sayının hem 5 ve hem 2'ye tam bölünüp bölünmediğini  bulan Java programını yazınız.
     */


}
