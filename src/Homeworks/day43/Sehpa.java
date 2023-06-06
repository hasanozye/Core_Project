package Homeworks.day43;

public class Sehpa extends Mobilya implements Dortgen {
    private double genislik;
    private double derinlik;


    public Sehpa(String aciklama, double yukseklik, boolean kapaliMi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public Sehpa() {
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        return isKapaliMi() ? 6 * genislik * derinlik : genislik * derinlik;
    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * getYukseklik();
    }

    @Override
    public String toString() {
        return String.format(" %s : [%.2f x %.2f x %.2f]", super.toString(), genislik, derinlik, getYukseklik());
    }
}
