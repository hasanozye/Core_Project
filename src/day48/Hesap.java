package day48;

public class Hesap {
    private String no;
    private String adi;
    private String soyadi;
    private double bakiye;


    public Hesap() {

    }

    public Hesap(String no, String adi, String soyadi, double miktar) throws MiktarHatası {
        this.no = no;
        this.adi = adi;
        this.soyadi = soyadi;
        paraYatir(miktar);
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }


    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }


    public double paraYatir(double miktar) throws MiktarHatası {
        if (miktar < 0) throw new MiktarHatası();
        return bakiye += miktar;
    }

    public double getBakiye() {
        return bakiye;
    }

    public double paraCek(double miktar) throws MiktarHatası, YetersizBakiyeHatası {
        if (miktar <= 0) throw new MiktarHatası();
        if (miktar > bakiye) throw new YetersizBakiyeHatası();
        return bakiye -= miktar;
    }


}
