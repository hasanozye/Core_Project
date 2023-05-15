package day23;

import java.util.Random;

public class SayilarDizisi {
    public static void main(String[] args) {
        /*On elemanlı sayılar dizi oluşturunuz.
         * Sonra 0-100 arasındaki rastgele tamsayılarla doldurunuz.
         * Listeleyip,toplamını ve ortalamasını gösteren bir Java programı yazınız.*/

        int[] sayilar = new int[10];

        Random random = new Random();
        int sum = 0;
        double ort;

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = random.nextInt(101);
            System.out.println((i + 1) + ". Sayı = " + sayilar[i]);
            sum += sayilar[i];

        }
        ort = (double) sum / sayilar.length;
        System.out.printf("Toplam: %d\n", sum);
        System.out.printf("Ortalama: %.2f\n", ort);
    }


}
