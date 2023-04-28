package day15;

import java.util.Scanner;

public class MenuTasarimi {
    public static void main(String[] args) {
        //TODO Devam edilcek
//        Dört işlem yapabilen Hesap Makinesi Tasarlayınız.
        System.out.println("-".repeat(20));
        System.out.println("     Dört İşlem     ");
        System.out.println("1. Toplama");
        System.out.println("2. Toplama");
        System.out.println("3. Toplama");
        System.out.println("4. Toplama");
        System.out.println("-".repeat(20));
        System.out.print("Seçiminiz: ");
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();
        System.out.println(secim);
        switch (secim){
            case 1:
                System.out.println("Toplama");
                break;
            case 2:
                System.out.println("Çıkarma");
                break;
            case 3:
                System.out.println("Çarpma");
                break;
            case 4:
                System.out.println("Bölme");
                break;
            default: break;
        }
    }
}
