package day59;

import java.util.Map;
import java.util.TreeMap;

public class MainApp2 {
    public static void main(String[] args) {
        Map<String,String> personel = new TreeMap<>();
        personel.put("Ahmet","Pazarlama");
        personel.put("Ayşe","Pazarlama");
        personel.put("Osman","Pazarlama");
        personel.put("Cengiz","Pazarlama");
        personel.put("Lütfiye","Pazarlama");
        personel.put("Şakir","Satış");
        personel.put("Şükriye","Satış");
        personel.put("Ahmet","Satış");

        System.out.println(personel);

        System.out.println(personel.entrySet());
    }
}
