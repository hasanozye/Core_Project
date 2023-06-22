package day54;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Book> kitapListesi = new ArrayList<>(List.of(
                new Book(1, "Sefiller", 55),
                new Book(2, "Java 8", 70),
                new Book(3, "C#", 45)
        ));
        //Fiyatı 50'den büyük olan kitapları listeleyiniz.

        /*
        Imperative approach and declarative approach
         */

        //Imperative
        /*System.out.println(kitapListesi);
        for (int i = 0; i < kitapListesi.size(); i++) {
            Book b = kitapListesi.get(i);
            if (kitapListesi.get(i).price() > 50){
                System.out.println(b);
            }
        }*/

        //Declarative
        kitapListesi.stream().filter(item -> item.price() > 50).forEach(item -> System.out.println(item));

//        Fiyatı 50'den küçük olanların sayısı nedir?
        System.out.println();
        System.out.println("The count of a numbers whom is smaller than 50 is: " + kitapListesi
                .stream()
                .filter(item -> item.price() < 50)
                .count());

/*
        int toplam = topla(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Toplam = " + toplam);*/
    }

    public static int topla(int... sayilar) {
        int toplam = 0;

        for (var item : sayilar) {
            toplam += item;
        }
        return toplam;
    }
}

record Book(int id, String name, double price) {
}
