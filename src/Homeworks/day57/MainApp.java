package Homeworks.day57;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Personel> personelList = Personel.calisanlar();

//        Çalışan personel adedini bulup, ekranda gösteriniz.
        long count = personelList.size();
        System.out.println("Çalışan personel adedi = " + count);
        System.out.println("Çalışan personel Listesi; ");
        personelList.stream().forEach(System.out::println);
        System.out.println("-".repeat(30));

//        Erkek ve kadın personel sayılarını buldurup, ekrana yazdırınız.
        long erkekPersonel = personelList.stream().filter(e -> e.cinsiyet().equals('E')).count();
        long kadinPersonel = personelList.stream().filter(k -> k.cinsiyet().equals('K')).count();
        System.out.printf("Kadın Personel Adedi : %d\tErkek Personel Adedi: %d\n", kadinPersonel, erkekPersonel);
        System.out.println("-".repeat(30));

//        Bu çalışanların firmaya olan toplam maliyetini hesaplayıp, ekrana yazdırınız.
        double maliyet = personelList.stream().mapToDouble(Personel::maas).sum();
        System.out.println("Çalışanların Toplam Maliyeti = " + maliyet);
        System.out.println("-".repeat(30));

//        Kadın çalışanların;
//        a. Listesini buldurunuz
//        b. Ekrana yazdırınız
        System.out.println("Kadın Çalışanlar Listesi;");
        personelList.stream().filter(k -> k.cinsiyet().equals('K')).forEach(System.out::println);
        System.out.println("-".repeat(30));

//        Maaş ortalaması;
//        a. Kadın çalışanların maaş ortalaması
//        b. Erkek çalışanların maaş ortalaması
//        c. Genel ortalama nedir
//        d. Hepsini tek bir satıra formatlı şekilde yazdırınız

        double kadinMaasOrtalama = personelList.stream()
                .filter(k -> k.cinsiyet().equals('K'))
                .mapToDouble(Personel::maas)
                .average()
                .getAsDouble();

        double erkekMaasOrtalama = personelList.stream()
                .filter(e -> e.cinsiyet().equals('E'))
                .mapToDouble(Personel::maas)
                .average()
                .getAsDouble();

        double ortalamaMaas = personelList.stream()
                .mapToDouble(Personel::maas)
                .average()
                .getAsDouble();

        System.out.printf("Kadın Çalışanların Maaş Ortalaması : %.2f" +
                "\t Erkek Çalışanların Maaş Ortalaması:  %.2f" +
                "\t Genel Ortalama Maaş: %.2f\n", kadinMaasOrtalama, erkekMaasOrtalama, ortalamaMaas);
        System.out.println("-".repeat(30));


//        Yaş; a. Tüm çalışanları büyükten küçüğe listeleyin ve ekrana yazdırın
//        b. Yaşı 35'ten büyük kadınların sayısını bulup, yazdırın
//        c. Yaşı 50'den küçük erkeklerin sayısını bulup, yazdırın
//        d. Tüm çalışanların yaş ortalaması nedir? Formatlı olarak yazdırınız

        System.out.println("Büyükten Küçüğe Yaşa Göre Sıralı Personel Listesi; ");
        personelList.stream()
                .sorted(Comparator.comparing(Personel::yas).reversed())
                .forEach(System.out::println);
        System.out.println("-".repeat(30));

        long buyuk35YasKadinSayisi = personelList.stream()
                .filter(k -> k.cinsiyet().equals('K'))
                .filter(item -> item.yas() > 35)
                .count();
        System.out.printf("Yaşı 35'ten büyük Kadın Personel Sayısı : %d\n", buyuk35YasKadinSayisi);
        System.out.println("-".repeat(30));

        System.out.println("Yaşı 35'ten büyük Kadın Personel Listesi; ");
        personelList.stream()
                .filter(k -> k.cinsiyet().equals('K'))
                .filter(item -> item.yas() > 35)
                .forEach(System.out::println);
        System.out.println("-".repeat(30));


        long kucuk50ErkekSayisi = personelList.stream()
                .filter(e -> e.cinsiyet().equals('E'))
                .filter(item -> item.yas() < 50)
                .count();
        System.out.println("Yaşı 50'den küçük Erkek Personel Sayısı: " + kucuk50ErkekSayisi);
        System.out.println("-".repeat(30));


        System.out.println("Yaşı 50'den küçük Erkek Personel Listesi; ");
        personelList.stream()
                .filter(e -> e.cinsiyet().equals('E'))
                .filter(item -> item.yas() < 50)
                .forEach(System.out::println);
        System.out.println("-".repeat(30));

//        Tüm çalışanların, önce kadınlar, sonra erkekler olacak şekilde isme göre sıralı listesini
//        a. buldurunuz
//        b. yazdırınız

        System.out.println("Tüm çalışanların İsme göre Önce Kadınlar Sonra Erkekler olacak şekilde sıralı Listesi; ");
        System.out.println("Kadınlar; ");
        personelList.stream().filter(k -> k.cinsiyet().equals('K'))
                .sorted(Comparator.comparing(Personel::adi, Collator.getInstance()))
                .forEach(System.out::println);
        System.out.println("-".repeat(30));

        System.out.println("Erkekler; ");
        personelList.stream().filter(e -> e.cinsiyet().equals('E'))
                .sorted(Comparator.comparing(Personel::adi, Collator.getInstance()))
                .forEach(System.out::println);
        System.out.println("-".repeat(30));

//        İsmi S ile başlayan çalışanların maaş toplamını ekrana yazdırınız.

        double sIleBaslyanaMaasToplami = personelList.stream()
                .filter(i -> i.adi().startsWith("S"))
                .mapToDouble(Personel::maas).sum();

        System.out.printf("İsmi S ile başlayan çalışanların maaş toplamı : %.2f", sIleBaslyanaMaasToplami);


    }

}

record Personel(Integer id, String adi, Double maas, Integer yas, Character cinsiyet) {
    public static List<Personel> calisanlar() {
        return List.of(
                new Personel(1, "Ahmet", 7500., 30, 'E'),
                new Personel(2, "Şahin", 3750., 45, 'E'),
                new Personel(3, "Şerife", 6500., 37, 'K'),
                new Personel(4, "Suna", 4900., 27, 'K'),
                new Personel(5, "Hakan", 6300., 23, 'E'),
                new Personel(6, "İlhan", 5250., 55, 'E'),
                new Personel(7, "Serkan", 4750., 47, 'E'),
                new Personel(8, "Songül", 8300., 19, 'K'),
                new Personel(9, "Ferhan", 11200., 34, 'E'),
                new Personel(10, "Osman", 13700., 41, 'E'),
                new Personel(11, "Kadriye", 11200., 33, 'K'),
                new Personel(12, "Fahriye", 9350., 42, 'K'),
                new Personel(13, "Sezen", 7775., 29, 'K'),
                new Personel(14, "Cumhur", 5800., 26, 'E'),
                new Personel(15, "Müzeyyen", 6950., 39, 'K'),
                new Personel(16, "Fatih", 6600., 56, 'E')
        );
    }
}
