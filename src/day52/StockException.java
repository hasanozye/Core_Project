package day52;

public class StockException extends Exception {
    private int id;
    private int miktar;

    public StockException(int id, int miktar) {
        super(String.format("Stok miktari azaldı. Id: %d, Miktar: %d", id, miktar));
        this.id = id;
        this.miktar = miktar;
    }

    public StockException() {
        super("Stock miktari azaldı.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
}
