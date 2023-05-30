package day36;

public class MainApp4 {
    public static void main(String[] args) {
        int x = 9;
        System.out.println("x = " + x);
        degistir(x);
        System.out.println("x = " + x);

        Kitap k1 = new Kitap("Suç ve Ceza", 0.5);
        System.out.println(k1);
        degistir(k1);
        System.out.println(k1);

    }

    public static void degistir(int x) {
        x += 5;
        System.out.println("Metot içi x = " + x);
    }

    public static void degistir(Kitap kitap) {
        kitap.setAdi("Kaşağı");
        kitap.setAgirlik(0.3);
    }


}

class Kitap {
    private String adi;
    private double agirlik;


    public Kitap() {
    }

    public Kitap(String adi, double agirlik) {
        this.adi = adi;
        this.agirlik = agirlik;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", agirlik=" + agirlik +
                '}';
    }
}
