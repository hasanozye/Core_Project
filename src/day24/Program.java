package day24;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Kopek k1 = new Kopek();

        k1.cinsi = "Kangal";
        k1.yasi = 3;
        k1.agirligi = 11.1;
        k1.bilgiGoster();

        System.out.println();
        Kopek k2 = new Kopek();
        k2.cinsi = "Doberman";
        k2.yasi = 1;
        k2.agirligi = 3.5;

        k2.bilgiGoster();

        Car car = new Car();
        car.renk = "\nTURQUAZ";
        System.out.println(car.renk);


    }
}
