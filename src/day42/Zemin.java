package day42;

public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin(String aciklama, double genislik, double uzunluk) {
        this.aciklama = aciklama;
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }

    public Zemin() {
    }


    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik < 0) return;
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk < 0) return;
        this.uzunluk = uzunluk;
    }

    public double alanHesapla() {
        return genislik * uzunluk;
    }

    @Override
    public String toString() {
        return String.format("%s (%d x %d)", aciklama, genislik, uzunluk);
    }


}
