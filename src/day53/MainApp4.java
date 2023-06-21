package day53;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp4 {
    public static void main(String[] args) {
        List<Double> agirliklar = new ArrayList<>(List.of(3.2, 7.8, 5.1));
        System.out.println(agirliklar);
        System.out.println();
        agirliklar.set(0, 5.8);
        System.out.println(agirliklar);
        Iterator<Double> iterator = agirliklar.iterator();
        double toplam = 0.0;
        while (iterator.hasNext()) {
            toplam += iterator.next();
        }
        double ortalama = toplam / agirliklar.size();
        System.out.println("ortalama = " + ortalama);
    }
}
