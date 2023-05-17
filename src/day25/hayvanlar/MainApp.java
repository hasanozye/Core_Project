package day25.hayvanlar;

import java.security.PublicKey;

public class MainApp {
    public static void main(String[] args) {
//        Kedi boncuk = new Kedi();
//        boncuk.cinsi = "Van Kedisi";
//        boncuk.yasi = 2;
//        boncuk.agirligi = 2.3;

        Kedi mirnav = new Kedi("Van Kedisi", 2, 2.3);


        Aslan aslan = new Aslan();
        aslan.kilo = 36.5;
        aslan.turu = "Homo Sapiens";
        aslan.boy = 60;
        aslan.rengi = "sari";
        aslan.cinsi = "Neandartel";

        Aslan aslan1 = new Aslan();
        aslan1.kilo = 36.5;
        aslan1.turu = "Homo Sapiens";
        aslan1.boy = 60;
        aslan1.rengi = "sari";
        aslan1.cinsi = "Neandartel";


    }
}
