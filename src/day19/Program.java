package day19;

public class Program {
    public static void main(String[] args) {
        int[] sayilar = {1, 3, 5, 9, 11};
        System.out.println(sayilar[0]);
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
//        System.out.println(sayilar[3]);

        int toplam = sayilar[0] + sayilar[1] + sayilar[2];
        System.out.println("toplam = " + toplam);

        for (int i = 0; i < 3; i++) {
            System.out.print(sayilar[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }
        System.out.println();

        for (int i = sayilar.length - 1; i >= 0; i--) {
            System.out.print(sayilar[i] + " ");

        }


    }
}
