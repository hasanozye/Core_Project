package day56.Task2;

import java.text.Collator;
import java.util.*;
import java.util.stream.Stream;

import static java.text.Collator.IDENTICAL;

public class MainApp {
    public static final String TEXT_RESET = "\u001B[0m";

    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    public static final String TEXT_BRIGHT_BLACK = "\u001B[90m";
    public static final String TEXT_BRIGHT_RED = "\u001B[91m";
    public static final String TEXT_BRIGHT_GREEN = "\u001B[92m";
    public static final String TEXT_BRIGHT_YELLOW = "\u001B[93m";
    public static final String TEXT_BRIGHT_BLUE = "\u001B[94m";
    public static final String TEXT_BRIGHT_PURPLE = "\u001B[95m";
    public static final String TEXT_BRIGHT_CYAN = "\u001B[96m";
    public static final String TEXT_BRIGHT_WHITE = "\u001B[97m";

    public static void main(String[] args) {

        final Collator TR_LANG = Collator.getInstance(new Locale("tr", "TR"));

        List<Sanatci> sanatcilar = new ArrayList<>(Arrays.asList(
                new Sanatci("Şener Şen", 73),
                new Sanatci("Kemal Sunal", 82),
                new Sanatci("Filiz Akın", 116),
                new Sanatci("Fatma Girik", 180),
                new Sanatci("Kadir İnanır", 182),
                new Sanatci("Hülya Koçyiğit", 200),
                new Sanatci("Sadri Alışık", 209),
                new Sanatci("Münir Özkul", 215),
                new Sanatci("Türkan Şoray", 222),
                new Sanatci("Ali Şen", 290),
                new Sanatci("Cüneyt Arkın", 400),
                new Sanatci("Hulusi Kentmen", 500),
                new Sanatci("Erol Taş", 600),
                new Sanatci("Gülşen Bubikoğlu", 50),
                new Sanatci("Ediz Hun", 130),
                new Sanatci("Adile Naşit", 300),
                new Sanatci("Tarık Akan", 111)));


//        Listedeki toplam Sanatci adedini ekrana yazdırınız.
        long sanatciAdedi= sanatcilar.stream().count();
        System.out.println(TEXT_YELLOW + "Sanatçı adedi : " + TEXT_RESET + sanatciAdedi);
        System.out.println("---".repeat(30));

//        100'den az filmi olan Sanatci adedi nedir?
        System.out.println(TEXT_BLUE + "100'den az filmi olan sanatçı listesi;" + TEXT_RESET);
        sanatcilar.stream().filter(item -> item.filmAdedi() < 100).forEach(System.out::println);
        System.out.println("---".repeat(30));

//        Sanatcilari isme göre sıralayıp, ekrana yazdırınız.
        System.out.println(TEXT_GREEN + "İsme göre sıralı sanatçı listesi;" + TEXT_RESET);
        sanatcilar.stream()
                .sorted(Comparator.comparing(Sanatci::isim, Collator.getInstance(new Locale("TR", "tr"))))
                .forEach(System.out::println);
        System.out.println("---".repeat(30));

//        En çok filmi olan sanatçı
        System.out.println(TEXT_BRIGHT_RED + "En çok filmi olan sanatçı;" + TEXT_RESET);
        Sanatci sanatci = sanatcilar.stream().max(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println(sanatci);
        System.out.println("---".repeat(30));

//        En az filmi olan sanatçı
        System.out.println(TEXT_BRIGHT_CYAN + "En az filmi olan sanatçı; " + TEXT_RESET);
        Sanatci sanatci1 = sanatcilar.stream().min(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println(sanatci1);
        System.out.println("---".repeat(30));

//        Film ortalaması nedir?
//        TODO: BU SORUYU HESAPLA
        System.out.println(TEXT_BRIGHT_PURPLE+ "Filmlerinx ortalaması: "+TEXT_RESET);


    }
}

record Sanatci(String isim, int filmAdedi) {

}
