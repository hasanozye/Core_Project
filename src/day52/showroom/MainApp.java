package day52.showroom;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 5, 7};
        for (var item : dizi) {

        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

        for (var item : numbers) {

        }


        ShowRoom showRoom = new ShowRoom();
        System.out.println("Capacity : " + showRoom.capacity());
        System.out.println("Size : " + showRoom.size());

        showRoom.add(new Car(1, "Araba 1"));
        showRoom.add(new Car(2, "Araba 2"));
        showRoom.add(new Car(3, "Araba 3"));


        System.out.println("Capacity : " + showRoom.capacity());
        System.out.println("Size : " + showRoom.size());
/*
        System.out.println(showRoom.get(0));
        System.out.println(showRoom.get(1));
        System.out.println(showRoom.get(2));
        System.out.println(showRoom.get(10));*/

        /*for (var item : showRoom) {
            System.out.println(item);
        }*/

        /*Iterator<Car> iterator = showRoom.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }*/

        /*showRoom.forEach(item -> System.out.println(item));*/

        showRoom.forEach(System.out::println);

    }
}
