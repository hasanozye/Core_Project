package day12.logicalops;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        /*
            Verilen bir sayının hem 2'ye hem de 3'e bölünüp bölünmediğini bulan bir java programı yazınız.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int sayi = scanner.nextInt();


        if (((sayi % 2) == 0) & (sayi % 3) == 0) {
            System.out.printf("%d, hem 2'ye hem 3'e tam bölünür. ", sayi);
            System.out.println();

        } else if ((sayi % 2) == 0) {
            System.out.printf("%d, yalnızca 2'ye tam bölünür. \n", sayi);

        } else if ((sayi % 3) == 0) {
            System.out.printf("%d, yalnızca 3'e tam bölünür. \n", sayi);
        } else {
            System.out.printf("%d, ne 2 ye ne 3'e tam bölünür. \n", sayi);
        }


    }
}
