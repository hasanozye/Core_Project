package day20;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //String[] aylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        /*String[] aylar = new String[12];
        aylar[0] = "Ocak";
        aylar[1] = "Şubat";
        aylar[2] = "Mart";
        aylar[3] = "Nisan";
        aylar[4] = "Mayıs";
        aylar[5] = "Haziran";
        aylar[6] = "Temmuz";
        aylar[7] = "Ağustos";
        aylar[8] = "Eylül";
        aylar[9] = "Ekim";
        aylar[10] = "Kasım";
        aylar[11] = "Aralık";*/
//        String[] aylar = new String[]{"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};

        String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        System.out.print("Kaçıncı ayı seçtiniz?[1,12] : ");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        if (secim > 0 & secim <= 12) {
            System.out.printf("Seçilen ay %s", aylar[secim - 1]);
        } else {
            System.out.println("Yanlış seçim.");
        }




    }
}
