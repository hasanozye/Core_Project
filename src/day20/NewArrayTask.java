package day20;

import java.util.Scanner;

public class NewArrayTask {
    public static void main(String[] args) {
        //Gün isimlerinden ibaret TR-EN sözlük hazırlayınız. Türkçe arama yapılmış ise ingilizcesinii
        //ingilizce arama yapılmış ise Trükçesini ekrana yazdırınız.


        System.out.print("Günü Giriniz: ");
        String day = new Scanner(System.in).nextLine();

        String[] trGunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
        String[] enGunler = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday"};


        for (int i = 0; i < trGunler.length; i++) {
            if (day.equalsIgnoreCase(enGunler[i])){
                System.out.println(trGunler[i]);
                break;
            }else if (day.equalsIgnoreCase(trGunler[i])){
                System.out.println(enGunler[i]);
                break;
            }

        }
    }
}
