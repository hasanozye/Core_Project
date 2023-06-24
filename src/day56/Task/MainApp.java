package day56.Task;

import java.text.Collator;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        final Collator TR_LANG = Collator.getInstance(new Locale("tr", "TR"));

        ArrayList<String> countryList = new ArrayList<>();
        Collections.addAll(countryList, "Türkiye", "Çin", "Amerika", "İngiltere");
        countryList.forEach(System.out::println);
        System.out.println();
        countryList.sort(Collator.getInstance(new Locale("tr", "TR")));
        countryList.forEach(System.out::println);

        System.out.println("-".repeat(20));
        List<String> liste = List.of("Türkiye", "Çin", "Amerika", "İngiltere");
        liste.forEach(System.out::println);
//        liste.remove(0);
//        liste.sort(Collator.getInstance(new Locale("tr","TR")));

    }
}


