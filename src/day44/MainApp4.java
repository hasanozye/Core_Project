package day44;

import javax.swing.*;

public class MainApp4 {
    public static void main(String[] args) {
        String isim = JOptionPane.showInputDialog("İsminiz. ");

        if (isim !=null&!isim.isBlank()){
            System.out.println(isim.toUpperCase());
        }else {
            System.out.println("İsim null, boşluk olamaz.");
        }

    }
}
