package Homeworks.day43;

public class Masa extends Mobilya implements Dortgen {
    private double genislik;
    private double derinlik;


    public Masa() {

    }

    public Masa(String aciklama, double yukseklik, boolean kapaliMi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
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
        double alan = 0.0;
        if (super.isKapaliMi()) {
            alan = 6 * genislik * derinlik;
        } else {
            alan = genislik * derinlik;
        }
        return alan;
    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * super.getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s [%5.2f x %5.2f x %5.2f]", super.toString(), genislik, derinlik, getYukseklik());
    }
}
