package day53;

import java.util.ArrayList;

public class MainApp1 {
    public static void main(String[] args) {
//        ArrayList
        ArrayList list = new ArrayList();
        list.add("Pazartesi");
        list.add("Salı");
        for (var item : list) {
            System.out.println(((String) item).toUpperCase());
        }
    }
}
