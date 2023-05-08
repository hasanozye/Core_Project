package day18;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String choice = showMainMenu().toUpperCase();

        switch (choice) {
            case "1":
                String mathSecim = showSubMenuMath().toUpperCase();
                if (mathSecim.equals("1")) {
                    //Faktoriyel Hesaplama
                    System.out.print("Faktöriyeli hesaplanacak Sayı : ");
                    System.out.println("Sonuç = " + faktoriyel(new Scanner(System.in).nextInt()));

                } else if (mathSecim.equals("2")) {
                    //Mutlak Değer Hesaplama
                    System.out.print("Mutlak değeri hesaplanacak Sayı: ");
                    Scanner scanner = new Scanner(System.in);
                    int sayi = scanner.nextInt();
                    System.out.printf("Sonuç = %d\n", Math.abs(sayi));

                } else if (mathSecim.equals("Q")) {
                    System.out.println("Programdan çıkıldı.");

                } else {
                    System.out.println("Yanlış seçim yaptınız.");
                }
                break;
            case "2":
                String geoSecim = showSubMenuGeoCounting().toUpperCase();
                switch (geoSecim) {
                    case "1":
                        //Dikdortgen
                        System.out.println("Dikdörgen için: ");
                        System.out.print("Uzun Kenar = ");
                        int uKenar = new Scanner(System.in).nextInt();
                        System.out.print("Kısa Kenar = ");
                        int kKenar = new Scanner(System.in).nextInt();
                        /*System.out.printf("Alan = %5d\n", kKenar * uKenar);
                        System.out.printf("Çevre = %5d\n", 2 * (kKenar + uKenar));*/
                        int alan = alanHesapla(uKenar, kKenar);
                        System.out.printf("Alan = %3d\n", alan);

                        int cevre = cevreHesapla(uKenar, kKenar);
                        System.out.printf("Çevre = %3d\n", cevre);

                        break;

                    case "2":
                        //Kare
                        System.out.println("Kare için: ");
                        System.out.print("Karenin kenarı: ");
                        Scanner scanner = new Scanner(System.in);
                        int kenar = scanner.nextInt();
                        int kareAlani = alanHesapla(kenar, kenar);
                        int kareCevresi = cevreHesapla(kenar, kenar);

                        System.out.printf("Alan = %3d\n", kareAlani);
                        System.out.printf("Çevre = %3d\n", kareCevresi);

                        break;

                    case "3":
                        //Daire
                        System.out.println("Daire için: ");
                        System.out.print("Dairenin yarıçapı: ");
                        Scanner scanner1 = new Scanner(System.in);
                        int yariCap = scanner1.nextInt();
                        double daireAlani = (alanHesapla(yariCap, yariCap) * Math.PI);
                        double daireCevresi = (2 * Math.PI * yariCap);


                        System.out.printf("Alan = %5.2f\n", daireAlani);
                        System.out.printf("Çevre = %5.2f\n", daireCevresi);

                        break;

                    case "Q":
                        //Çıkış
                        System.out.println("Programdan Çıkıldı.");
                        break;

                    default:
                        System.out.println("Yanlış seçim yaptınız.");
                        break;

                }
                break;
            case "Q":
                System.out.println("Programdan Çıkıldı.");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                break;
        }


    }

    public static int cevreHesapla(int uKenar, int kKenar) {
        return 2 * (kKenar + uKenar);
    }

    public static int alanHesapla(int uKenar, int kKenar) {
        return uKenar * kKenar;
    }

    public static String showMainMenu() {
        System.out.println("Ana Menü");
        System.out.println("1. Matematik İşlemleri");
        System.out.println("2. Alan ve Çevre Hesaplamaları");
        System.out.println("Q. Çıkış");
        System.out.print("What is your choice: ");
        /*Scanner scanner = new Scanner(System.in);
        String  choice = scanner.next();*/
        return new Scanner(System.in).nextLine();


    }

    public static String showSubMenuMath() {
        System.out.println("Alt Menü | Matematik İşlemleri");
        System.out.println("1. Faktöriyel Hesaplama");
        System.out.println("2. Mutlak Değer Alma");
        System.out.println("Q. Çıkış");
        System.out.print("What is your choice: ");
        return new Scanner(System.in).nextLine();
    }

    public static String showSubMenuGeoCounting() {
        System.out.println("Alt Menü | Alan ve Çevre Hesaplama");
        System.out.println("1. Dikdörtgen");
        System.out.println("2. Kare");
        System.out.println("3. Daire");
        System.out.println("Q. Çıkış");
        System.out.print("What is your choice: ");
        return new Scanner(System.in).nextLine();
    }

    public static int faktoriyel(int value) {
        if (value < 2) return 1;

        int carpim = 1;

        for (int i = 2; i <= value; i++) {
            carpim *= i;
        }
        return carpim;
    }
}
