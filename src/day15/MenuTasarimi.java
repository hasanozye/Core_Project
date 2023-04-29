package day15;

import java.util.Scanner;

public class MenuTasarimi {
    public static void main(String[] args) {

//        Dört işlem yapabilen Hesap Makinesi Tasarlayınız.
        System.out.println("-".repeat(20));
        System.out.println("     Dört İşlem     ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("-".repeat(20));
        System.out.print("Seçiminiz: ");
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();
        int result = Integer.MIN_VALUE;


        String first = "Birinci Sayı : ";
        String second = "İkinci Sayı : ";
        boolean flag = true;

        switch (secim) {
            case 1:
                System.out.println("Toplamı bulunacak sayıları giriniz.");
                System.out.print(first);
                int n1 = scanner.nextInt();
                System.out.print(second);
                int n2 = scanner.nextInt();
                result = n1 + n2;
                break;
            case 2:
                System.out.println("Birbirinden çıkartılacak sayıları giriniz. ");
                System.out.print(first);
                n1 = scanner.nextInt();
                System.out.print(second);
                n2 = scanner.nextInt();
                result = n1 - n2;
                break;
            case 3:
                System.out.println("Çarpıalcak sayıları giriniz. ");
                System.out.print(first);
                n1 = scanner.nextInt();
                System.out.print(second);
                n2 = scanner.nextInt();
                result = n1 * n2;
                break;
            case 4:
                System.out.println("Bölünecek sayıları giriniz. ");
                System.out.print(first);
                n1 = scanner.nextInt();
                System.out.print(second);
                n2 = scanner.nextInt();
                if (n2 == 0) {
                    System.out.println("Geçersiz işlem yaptınız.");
                    flag = false;
                    break;
                }
                result = n1 / n2;
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                flag = false;
                break;
        }
        if (flag) {
            System.out.println("result = " + result);
        }
    }
}
