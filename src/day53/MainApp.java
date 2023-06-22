package day53;

public class MainApp {
    public static void main(String[] args) {
        ShowRoom showRoom1 =new ShowRoom();
        showRoom1.add(new Car(1,"Araba 1"));
        showRoom1.add(new Car(2,"Araba 2"));
        showRoom1.add(new Car(3,"Araba 3"));


        showRoom1.forEach(car -> System.out.println(car));

        Car remove = showRoom1.remove(1);

        System.out.println();
        showRoom1.forEach(car -> System.out.println(car));

        System.out.println();
        System.out.println(remove);






    }
}
