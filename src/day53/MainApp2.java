package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp2 {
    public static void main(String[] args) {
        List<String> aylar = new ArrayList<>(Arrays.asList("Ocak", "Şubat", "Mart"));
        List<String> gunler = List.of("Pazartesi", "Salı", "Çarşamba");//Immutable

//        gunler.add("Perşembe");
        aylar.add("Nisan");


        ArrayList<String> list = new ArrayList<>(gunler);
        list.add("Perşembe");
        System.out.println(list);

        System.out.println();
        System.out.println(aylar);


    }
}
