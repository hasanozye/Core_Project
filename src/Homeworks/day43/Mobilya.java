package Homeworks.day43;

public class Mobilya {
    private String aciklama;
    private double yukseklik;
    private boolean kapaliMi;

    public Mobilya() {
    }

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi) {
        this.aciklama = aciklama;
        setYukseklik(yukseklik);
        this.kapaliMi = kapaliMi;
    }


    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik < 0){
            System.err.println("Yukseklik 0 dan küçük olamaz.");
            System.exit(1);
        }
        this.yukseklik = yukseklik;
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }


    @Override
    public String toString() {
        return aciklama;
    }
}
