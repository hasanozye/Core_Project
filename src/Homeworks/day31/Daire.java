package Homeworks.day31;

public class Daire {
    private double yaricap;

    public Daire() {
    }

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public void setYaricap(double yaricap) {
        if (yaricap < 0) yaricap = 0;
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getAlan() {
        return Math.PI * Math.pow(yaricap, 2);
    }


}
