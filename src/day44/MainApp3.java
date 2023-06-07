package day44;

import javax.swing.*;

public class MainApp3 {
    public static void main(String[] args) {
        /*
        1. Scanner
        2. JOptionPane.showInputDialog
         */
        String str = null;
//        System.out.println(str.toUpperCase());
        String isim = JOptionPane.showInputDialog("İsminiz. ");
        try {
            System.out.println("Merhaba : "+isim.toUpperCase());
            System.out.println(isim.charAt(0));

        }catch (NullPointerException ex){
            System.out.println("Bir hata oluştu."+ex.getMessage());
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("Bir hata oluştu: "+ex.getMessage());
        }



    }
}
