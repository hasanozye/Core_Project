package day29;

public class MainApp {
    public static void main(String[] args) {

        /*Hayvan hy1 = new Hayvan();
        Kedi k1 = new Kedi();
        Koyun ko1 = new Koyun();

        hy1.beslen();
        k1.beslen();
        k1.avlan();
        ko1.beslen();*/

        Araba araba = new Araba();
        YarisArabasi yarisArabasi = new YarisArabasi();
        Araba araba2 = new YarisArabasi();

        araba.ilerle();
        yarisArabasi.ilerle();
        araba2.ilerle();

        yarisArabasi.turbo();
        ((YarisArabasi) araba2).turbo();



    }
}
