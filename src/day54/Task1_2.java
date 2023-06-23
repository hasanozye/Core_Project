package day54;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer sayi = iterator.next();
            if (sayi % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);

        int toplam = 0;
        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer s = iterator.next();
            if (s % 2 == 0) {
                toplam += s;
            }
        }

        System.out.println("toplam = " + toplam);


    }
}
