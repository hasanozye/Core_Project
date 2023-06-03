package day42;

public class Hali {
    private double fiyat;

    public Hali(double fiyat) {
        setFiyat(fiyat);
    }

    public Hali() {
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat < 0) return;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", "Birim Fiyatı ", fiyat);
    }
}
