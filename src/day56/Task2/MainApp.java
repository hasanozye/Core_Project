package day56.Task2;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

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

        final Collator TR_LANG = Collator.getInstance();

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
        long toplamSanatci = sanatcilar.stream().count();
        System.out.println(TEXT_YELLOW + "Toplam Sanatçı adedi : " + TEXT_RESET + toplamSanatci);

        System.out.println("---".repeat(30));

//        100'den az filmi olan Sanatci adedi nedir?
        long az100 = sanatcilar.stream()
                .filter(item -> item.filmAdedi() < 100)
                .count();
        System.out.println(TEXT_BLUE + "100'den az filmi olan sanatçı adedi: " + TEXT_RESET + az100);

        System.out.println("---".repeat(30));

//        100'den az filmi olan Sanatci adedi nedir?
        System.out.println(TEXT_BLUE + "100'den az filmi olan sanatçı listesi: " + TEXT_RESET);
        List<Sanatci> az100List = sanatcilar.stream()
                .filter(x -> x.filmAdedi() < 100)
                .collect(Collectors.toList());
        az100List.stream()
                .forEach(System.out::println);


        System.out.println("---".repeat(30));


//        Sanatcilari isme göre sıralayıp, ekrana yazdırınız.
        System.out.println(TEXT_GREEN + "İsme göre sıralı sanatçı listesi;" + TEXT_RESET);
        sanatcilar.stream()
                .sorted(Comparator.comparing(Sanatci::isim, TR_LANG))
                .forEach(System.out::println);

        System.out.println("---".repeat(30));

//        En çok filmi olan sanatçı
        System.out.print(TEXT_BRIGHT_RED + "En çok filmi olan sanatçı: " + TEXT_RESET);
        Sanatci enCokFilm = sanatcilar.stream()
                .max(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println(enCokFilm);

        System.out.println("---".repeat(30));

//        En az filmi olan sanatçı
        System.out.print(TEXT_BRIGHT_CYAN + "En az filmi olan sanatçı: " + TEXT_RESET);
        Sanatci enAzFilm = sanatcilar.stream()
                .min(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println(enAzFilm);

        System.out.println("---".repeat(30));

//        Film ortalaması nedir?
        System.out.print(TEXT_BRIGHT_PURPLE + "Sanatçıların Film ortalaması: " + TEXT_RESET);
        double ortalamaFilmAdedi = sanatcilar.stream()
                .mapToDouble(Sanatci::filmAdedi).average().getAsDouble();
        System.out.println(Math.round(ortalamaFilmAdedi));

        System.out.println("---".repeat(30));

//        Toplam Film adedi nedir?
        System.out.print(TEXT_BRIGHT_YELLOW + "Sanatçıların Toplam Film Adedi :" + TEXT_RESET);
        int toplamFilmAdedi = sanatcilar.stream()
                .mapToInt(Sanatci::filmAdedi).sum();
        System.out.println(toplamFilmAdedi);

        System.out.println("---".repeat(30));


//        İsmi A ile başlayıp 300 ve üzeri filmi olan sanatçı listesi
        List<Sanatci> aVe300uzeri = sanatcilar.stream().filter(s -> s.isim().startsWith("A") & s.filmAdedi() >= 300).toList();
        aVe300uzeri.stream().forEach(System.out::println);

        System.out.println("---".repeat(30));
    }
}

record Sanatci(String isim, int filmAdedi) {

}
