package Homeworks.geometri;

public class MainApp {
    public static void main(String[] args) {
        Kare k1 = new Kare(7);
        Daire d1 = new Daire(7);

        double alanFarki = Math.abs(k1.alanHesapla() - d1.alanHesapla());
        double cevreFarki = Math.abs(k1.cevreHesapla() - d1.cevreHesapla());

        System.out.printf("Alan Farkı = %.2f\n", alanFarki);
        System.out.printf("Çevre Farkı = %.2f\n", cevreFarki);


    }

}
