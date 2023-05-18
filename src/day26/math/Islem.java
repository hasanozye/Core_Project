package day26.math;

public class Islem {
    /*
    Overload: Metotların overload (aşırı yükleme) edilmesinde
    metotların imzalarına bakılır.
    Bir metodun imzası o metodun parametre adetleri ve
    parametre tiplerinin çeşitliliğidir.

    Metotların dönüş tipleri imzadan sayılmaz.
     */
    public static int topla(int a, int b) {
        return a + b;
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static int carp(int a, int b) {
        return a * b;
    }


    public static int cikar(int a, int b) {
        return a - b;
    }

    public static int bol(int a, int b) {
        return a / b;
    }


}
