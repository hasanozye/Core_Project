package day42;

public class Hesap {
    private Zemin zemin;
    private Hali hali;

    public Hesap() {
    }

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }

    public double getToplamMaliyet() {
        return zemin.alanHesapla() * hali.getFiyat();
    }

    @Override
    public String toString() {
        return String.format("%s : %.2f","Toplam Maliyet",getToplamMaliyet());
    }
}
