package day60;

public class MainApp2 {
    public static void main(String[] args) {
        Otomobil ot1 = new Otomobil("Araba 1",30);

        Otomobil ot2 = new Otomobil("Araba 2",50);
        Otomobil ot3 = new Otomobil("Araba 3",70);
        ot1.start();
        ot2.start();
        ot3.start();
    }
}
