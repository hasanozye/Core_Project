package day53;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainApp3 {
    public static void main(String[] args) {
        //Wrapper classes

        Iterable<String> gunler = new ArrayList<>(List.of("Pzt", "Sal", "Çar"));
        gunler.forEach(item -> System.out.print(item + " "));


        Collection<String> aylar = new ArrayList<>();
        aylar.add("Ocak");
        aylar.add("Şubat");
        System.out.println(aylar);


        List<String> isimler = List.of("Ahmet", "Hakan", "Hasan", "İlhan");
        isimler.forEach(System.out::println);

//        ArrayList<int> numbers = new ArrayList<int>(); xxxxx Primitive types cant be used in generics xxxxxx
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(11);
        numbers.add(1,18);
        numbers.addAll(List.of(4,5,8));

        numbers.remove((Integer) 3);

        System.out.println(numbers.get(2));

//        Integer x = new Integer(7);
        Integer x = 7;
        String str = "abcde";

        System.out.println(numbers);

        double toplam = 0.0;

        for (var number : numbers) {
            toplam += number;

        }
        System.out.println("Toplam = " + toplam);

        String str1 = "17";
        Integer num = Integer.parseInt(str1);
        int kare = num * num;
        System.out.println(kare);


    }


}
