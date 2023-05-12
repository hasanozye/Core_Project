package day22;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int secim = 1;
        do {
            System.out.println("1. Topla");
            System.out.println("2. Çıkar");
            System.out.println("3. Çarp");
            System.out.println("4. Böl");
            System.out.println("5. Kapat");
            System.out.print("Seçim : ");
            secim = new Scanner(System.in).nextInt();


        } while (true);
    }
}
