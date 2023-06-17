package day50;


import java.util.ArrayList;
import java.util.Iterator;

/*
Daha gelişmişi Lombok Kütüphanesi
 */
public class MainApp3 {
    public static void main(String[] args) {
        Kitap k1 = new Kitap(1, "Kitap 1");
//        System.out.println(k1);
        ArrayList<Kitap> kitapListesi = new ArrayList<>();
        kitapListesi.add(new Kitap(5, "Kitap 5"));
        kitapListesi.add(k1);

        kitapListesi.add(0, new Kitap(3, "Kitap 3"));

        k1 = null;

        /*
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i));
        }


        Iterator<Kitap> iterator = kitapListesi.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        var k = new Kitap(3,"Kitap 3");
        for(var k : kitapListesi){
            System.out.println(k);
        }
         */

        kitapListesi.forEach(k -> System.out.println(k));


    }
}
