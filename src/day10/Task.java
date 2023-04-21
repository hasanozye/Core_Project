package day10;

public class Task {
    /*
    Kenar uzunluğu verilen bir karenin alan hesaplaması yapıalcaktır. Bunun için karenin alanının geriye döndüren bir
    metot tasarlayınız. Daha sonra bu metodu main içerisinden çağırarak iki farklı karenin alanlarını toplayınız.
    Metot ismi alanHesapla olacaktır.
     */
    public static void main(String[] args) {
        int firstAlan = alanHesapla(3);
        int secondAlan = alanHesapla(5);
        System.out.println("Alanlar Toplamı: " + (firstAlan + secondAlan));

    }

    public static int alanHesapla(int kenar) {
        return kenar * kenar;
    }


}
