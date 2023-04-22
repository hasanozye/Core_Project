package day11;

public class Daire {
    public static void main(String[] args) {
        double r1 = 7.0;
        System.out.printf("Alan = %5.2f\n ", alanHesapla(r1));
        System.out.printf("Çevre = %5.2f\n ", cevreHesapla(r1));

    }

    public static double alanHesapla(double radius) {
        return Math.PI * Math.pow(radius, 2)

                ;
    }

    public static double cevreHesapla(double radius) {
        return 2 * Math.PI * radius


                ;
    }
}
