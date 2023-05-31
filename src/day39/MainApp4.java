package day39;

import javax.swing.*;

public class MainApp4 {
    public static void main(String[] args) {
        /*
            TASK:
            1. Verilen ismin (ad soyad) baş harflerini tutan, fakat geri kalan harflerin yerine asteriks (*) karakteri
            koyan ve metni geriye döndüren bir metot yazınız. Metodun ismi hideNames olacaktır.
            2. Klavyeden isim alınıp, ekranda örnekteki gibi gösterim yapılacaktır.
            Örnek;  Ahmet Dursun
                    A**** D*****
         */

        //System.out.println(hideNames("Ahmet Dursun"));

        String i̇sim = JOptionPane.showInputDialog(null, "İsminizi giriniz:", "İsim Gizleme", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(hideNames(i̇sim));

    }

    public static String hideNames(String name){
        int indexSpace=name.indexOf(" ");
        String tmp="";
        for (int i = 0; i < name.length(); i++) {
            if(i==0){
                tmp+=name.charAt(i);
            } else if (i == indexSpace + 1) {
                tmp+=name.charAt(indexSpace+1);
            } else if (i == indexSpace) {
                tmp+=" ";
            } else {
                tmp+="*";
            }
        }
        return tmp;
    }

}