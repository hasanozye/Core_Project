package day53;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) {
                oddNumbers.add(numbers.get(i));
            }
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }

        numbers.forEach(item -> System.out.print(item + " "));

        System.out.println();

        Iterator<Integer> iterator = oddNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        System.out.println(evenNumbers);


    }
}
