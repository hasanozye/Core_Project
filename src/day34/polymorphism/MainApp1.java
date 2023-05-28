package day34.polymorphism;

public class MainApp1 {
    public static void main(String[] args) {
        Kare k = new Kare(15);
        sekilInfo(k);

        Daire d = new Daire(11);
        sekilInfo(d);

        Dikdortgen dik = new Dikdortgen(7, 12);
        sekilInfo(dik);

    }

    public static void sekilInfo(Sekil sekil) {
        if (sekil== null) return;
        System.out.println("-".repeat(40));

        System.out.printf("Alan = %.2f - Çevre = %.2f\n", sekil.alanHesapla(), sekil.cevreHesapla());

        System.out.println("-".repeat(40));

    }
}
