package day62;

public record Araba(String marka,double fiyat) implements Printable {
    @Override
    public void print(){
        System.out.println(this);
    }
}
