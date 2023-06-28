package day60;

public class MainApp1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "  Başladı.");
        Sayac s = new Sayac();
        s.setName("Sayaç");
//        s.run(); ASLA ÇALIŞTIRMA
        s.start(); // Her zaman bununla başla!!!!
        System.out.println(Thread.currentThread().getName() + " Bitti");
    }
}
