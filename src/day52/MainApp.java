package day52;

public class MainApp {
    public static void main(String[] args) {
        Urun urun1 = new Urun(5, "Klavye", 50, 20);

        try {
            urun1.urunCek(5);
            urun1.urunCek(10);
        } catch (StockException e) {
            System.err.println(e.getMessage());
        }

    }
}
