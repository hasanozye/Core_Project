package day59;

import java.text.Collator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainApp3 {
    public static void main(String[] args) {
        Map<String, Integer> aylar = new TreeMap<>(Collator.getInstance());
        aylar.put("Ocak", 31);
        aylar.put("Şubat", 28);
        aylar.put("Mart", 31);
        aylar.put("Nisan", 30);
        aylar.put("Mayıs", 31);
        aylar.put("Haziran", 30);
        aylar.put("Temmuz", 31);
        aylar.put("Ağustos", 31);
        aylar.put("Eylül", 30);
        aylar.put("Ekim", 31);
        aylar.put("Kasım", 30);
        aylar.put("Aralık", 31);

        Set<String> ayAdlari = aylar.keySet();
        ayAdlari.forEach(System.out::println);
        System.out.println("-".repeat(30));


//        30 gün çeken ayları listele
        Set<Map.Entry<String, Integer>> entries = aylar.entrySet();
        entries
                .stream()
                .filter(item -> item.getValue() == 30)
                .forEach(System.out::println);
        System.out.println("-".repeat(30));

//        5 harfli Ayları listele
        Set<Map.Entry<String, Integer>> entries2 = aylar.entrySet();
        entries2
                .stream()
                .filter(item -> item.getKey().split("").length == 5)
                .forEach(System.out::println);
        System.out.println("-".repeat(30));

//        5 harfli aylarin toplam gün listesi nedir?
        Set<Map.Entry<String, Integer>> entries3 = aylar.entrySet();
        int toplamGunListesi = entries3
                .stream()
                .filter(i -> i.getKey().length() == 5)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println("5 harfli aylarin toplam gün listesi = " + toplamGunListesi);
        System.out.println("-".repeat(30));


    }
}
