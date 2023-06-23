package day55.Kafeterya;

import java.text.Collator;
import java.util.*;

public class Stok extends ArrayList<Urun> {

    private static final Collator TR_LANG = Collator.getInstance(new Locale("tr", "TR"));

    public void listele() {
        stream().forEach(urun -> System.out.println(urun));
        System.out.println();
    }

    public void isimSiraliListele() {
        stream()
                .sorted(Comparator.comparing(Urun::adi, TR_LANG))
                .forEach(System.out::println);
        System.out.println();
    }

    public void fiyataGoreListele() {
        stream().sorted(Comparator.comparing(Urun::fiyat).thenComparing(Urun::adi, TR_LANG))
                .forEach(System.out::println);
        System.out.println();
    }

    public void fiyataGoreTersSiraListele() {
        stream()
                .sorted(Comparator.comparing(Urun::fiyat).reversed().thenComparing(Urun::adi, TR_LANG))
                .forEach(System.out::println);
        System.out.println();
    }

    public void fiyataGoreTerseveMiktaraGoreTersSiraliSlistele() {
        stream()
                .sorted(Comparator.comparing(Urun::fiyat).reversed().thenComparing(Comparator.comparing(Urun::miktar).reversed()))
                .forEach(System.out::println);
        System.out.println();
    }

    public List<Urun> head(int n) {
        return stream()
                .limit(n).toList();
    }

    public List<Urun> head() {
        return head(5);
    }

    public List<Urun> tail(int n) {
        Objects.checkIndex(size() - n, size());
        return stream().skip(size() - n).toList();
    }

    public List<Urun> tail() {
        return stream().skip(5).toList();
    }


}
