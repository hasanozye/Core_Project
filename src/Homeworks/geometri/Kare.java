package Homeworks.geometri;

public class Kare {
    public int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    public int alanHesapla() {
        return kenar * kenar;
    }

    public int cevreHesapla() {
        return 4 * kenar;
    }

    public double kosegenUzunlugu() {
        return kenar * Math.sqrt(2);
    }


}
