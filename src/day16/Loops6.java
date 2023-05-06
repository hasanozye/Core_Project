package day16;

public class Loops6 {
    public static void main(String[] args) {
        //TODO: 1'den 10'a kadar olan sayıların toplamını bulan java programını yazın
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            toplam +=i;
        }
        System.out.println("toplam = " + toplam);
    }
}
