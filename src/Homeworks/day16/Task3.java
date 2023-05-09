package Homeworks.day16;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
         * 0'dan 100'e kadar olan sayılardan hem 3'e hem  de 2'ye tam bölümebilem sayıları ekrana yazdıran Java programını
         * yazınız. (Sıfır ve yüz dahil)*/
        int n1 = 3;
        int n2 = 2;
        for (int i = 0; i <= 100; i++) {
            if (i % (n1 * n2) == 0){
                System.out.println("i = " + i);
            }
        }


    }
}
