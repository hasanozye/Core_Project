package day55.Kafeterya;

import java.util.List;

public record Urun(int id, String adi, double fiyat, int miktar) {
    public static List<Urun> stokHazirla() {
        return List.of(
                new Urun(1, "Tost", 2.5, 50),
                new Urun(2, "Çay", 1.0, 70),
                new Urun(3, "Çorba", 3.0, 80),
                new Urun(4, "Sütlü Tatlı", 4.0, 40),
                new Urun(5, "Ayran", 2.0, 100),
                new Urun(6, "Gazoz", 2.0, 100),
                new Urun(7, "Soda", 2.0, 75),
                new Urun(8, "Cola", 2.0, 120),
                new Urun(9, "Baklava", 5.0, 30),
                new Urun(10, "Salata", 3.0, 60),
                new Urun(11, "Börek", 4.0, 10)
        );
    }
}
