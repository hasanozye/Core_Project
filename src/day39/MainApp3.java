package day39;

import javax.swing.*;

public class MainApp3 {
    public static void main(String[] args) {
        /*
            1. Verilen ismin (ad soyad) sadece baş harflerini geri döndüren bir metot tasarlayınız.
            2. Kullanıcıdan bir isim alıp ekranda gösteriniz.
         */

        //System.out.println(findInitialLetters("Ahmet Dursun"));

        String isim = JOptionPane.showInputDialog("Lütfen İsminizi giriniz");
        System.out.println("İsminizin baş harfleri : "+findInitialLetters(isim));
    }

    //Ahmet Dursun
    public static String findInitialLetters(String isim){
        int indexSpace=isim.indexOf(" ");
        String first=""+isim.charAt(0);
        String second=""+isim.charAt(indexSpace+1);

        return first+second;
    }


}