package day55;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> numbers1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 7, 8, 9, 10));

        numbers.stream().forEach(item -> System.out.print(item + " "));

        System.out.println();

        Stream<Integer> stream = numbers.stream();
        List<Integer> evenNumbers = stream.filter(item -> item % 2 == 0).toList();
        evenNumbers.forEach(number -> System.out.println(number));

        System.out.println();
        Stream<Integer> stream1 = numbers.stream();
        List<Integer> oddNumbers = stream1.filter(item -> item % 2 != 0).toList();
        oddNumbers.forEach(System.out::println);

        numbers.removeIf(item -> item % 2 != 0);
        System.out.println("numbers = " + numbers);

        numbers1.removeIf(item -> item % 2 == 0);
        System.out.println(numbers1);


    }
}
