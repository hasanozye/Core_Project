package day30.kutuphane;

public class Kitap {
    private boolean gecerliMi = true;
    private String adi;
    private String yazari;
    private int sayfaAdedi;

    public Kitap() {
    }

    public Kitap(String adi, String yazari, int sayfaAdedi) {
        setAdi(adi);
        setYazari(yazari);
        setSayfaAdedi(sayfaAdedi);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        if (adi != null & !adi.isEmpty() & !adi.isBlank()) {
            this.adi = adi;
        }else {
            gecerliMi = false;
            System.err.println("Kitap Adı boş olamaz.");
        }
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        if (yazari != null & !yazari.isEmpty() & !yazari.isBlank()) {
            this.yazari = yazari;
        }else {
            gecerliMi = false;
            System.err.println("Yazarı boş olamaz.");
        }
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi) {
        if (sayfaAdedi > 0) {
            this.sayfaAdedi = sayfaAdedi;
        } else {
            gecerliMi = false;
            System.err.println("Sayfa adedi negatif olamaz.");
        }
    }

    public void kaydet() {
        if (gecerliMi) {
            System.out.println(this + " Veritabanına kaydedildi.");
        } else {
            System.out.println("Kayıt işlemi başarısız.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s : %d)", adi, yazari, sayfaAdedi);
    }
}
