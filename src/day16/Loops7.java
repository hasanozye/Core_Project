package day16;

public class Loops7 {
    public static void main(String[] args) {
        /*
         * Birden 10'a kadar olan sayıların toplamını yazınız.*/
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            toplam += i;

        }
        System.out.println("toplam = " + toplam);
        System.out.println("Ortalama = " +(toplam/10.0));
    }
}
