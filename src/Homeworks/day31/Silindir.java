package Homeworks.day31;

public class Silindir extends Daire {
    private double yukseklik;

    public Silindir() {
    }

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        if (yukseklik < 0) yukseklik = 0;
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim() {
        return super.getAlan() * getYukseklik();
    }


    @Override
    public double getAlan() {
        return (2 * super.getAlan()) + (2 * Math.PI * getYaricap() * getYukseklik());
    }
}
