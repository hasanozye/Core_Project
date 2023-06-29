package day61.enumeration;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Yon yon = Yon.BATI;

        switch (yon) {
            case BATI:
                System.out.println("Batıya gidiyor");
                break;
            case DOGU:
                System.out.println("Doğuya gidiyor");
                break;
            case KUZEY:
                System.out.println("Kuzeye gidiyor");
                break;
            case GUNEY:
                System.out.println("Güneye gidiyor");
            default:
                System.out.println("Yanlış yön");
        }

        Yon[] yonler = Yon.values();
        for (var y: yonler){
            System.out.println(y);
        }


    }
}
