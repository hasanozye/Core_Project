package Homeworks.day11;

import java.util.Scanner;

public class Dortgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Karenin kenarını giriniz: ");
        int kareKenar = scanner.nextInt();

        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int dKisaKenar = scanner.nextInt();

        System.out.print("Dikdörtgenin uzun kenarının giriniz: ");
        int dUzunKenar = scanner.nextInt();

        int kareAlan = alanHesapla(kareKenar, kareKenar);
        int kareCevre = cevreHesapla(kareKenar, kareKenar);
        int dAlan = alanHesapla(dUzunKenar, dKisaKenar);
        int dCevre = cevreHesapla(dKisaKenar, dUzunKenar);

        int toplamAlan = kareAlan + dAlan;
        int toplamCevre = dCevre + kareCevre;
        System.out.println("toplamCevre = " + toplamCevre);
        System.out.println("toplamAlan = " + toplamAlan);


    }

    public static int alanHesapla(int k1, int k2) {
        return k1 * k2;
    }

    public static int cevreHesapla(int k1, int k2) {
        return 2 * (k1 + k2);
    }


}
