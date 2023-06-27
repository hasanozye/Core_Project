package day59;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        /*
        Maps,
        Anahtar = Değer
        key=value

        Örnek;
        il=Ankara

        Ankara=5M
        İstanbul=12M


        Ocak=31
        Nisan=30
         */

        /*int[] sayilar = new int[5];
        sayilar[0] = 5;
        sayilar[0] = 3;
        sayilar[0] = 7;*/

        Map<Integer, String> aylar = new HashMap<>();
        aylar.put(1, "Ocak");
        aylar.put(2, "Şubat");
        aylar.put(3, "Mart");
        aylar.put(4, "Nisan");
        aylar.put(5, "Mayıs");
        aylar.put(6, "Haziran");
        aylar.put(7, "Temmuz");
        aylar.put(8, "Ağustos");
        aylar.put(9, "Eylül");
        aylar.put(10, "Ekim");
        aylar.put(11, "Kasım");
        aylar.put(12, "Aralık");

        System.out.println("aylar = " + aylar);
        System.out.println("-".repeat(30));

        Set<Integer> keys = aylar.keySet();
        System.out.println(keys);
        System.out.println("-".repeat(30));

        Collection<String> values = aylar.values();
        System.out.println(values);
        System.out.println("-".repeat(30));

        Set<Map.Entry<Integer, String>> entries = aylar.entrySet();
        /*entries.forEach(e -> {
            System.out.printf("%d ----> %s\n", e.getKey(), e.getValue());
        });*/
        System.out.println(entries);
        System.out.println("-".repeat(30));



    }
}
