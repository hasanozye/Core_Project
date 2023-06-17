package day50;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        /*
        COLLECTIONS FRAMEWORK
         */

        int x = 9;
        double d = 3.4;
        int[] numbers = {3, 5, 7, 9};

        ArrayList liste = new ArrayList();
        liste.add("Ahmet");
        liste.add("Osman");
        liste.add("Cengiz");
        liste.add(5);
        liste.add(new Scanner(System.in));

        String str = (String) liste.get(0);
        System.out.println(str.toUpperCase());


        System.out.println("Size : "+ liste.size());

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }


    }
}
