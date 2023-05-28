package day35;

public class KopekBaligi extends Hayvan implements Avci,Yuzucu{

    @Override
    public void avlan() {
        System.out.println("Köpek Balığı");
    }

    @Override
    public void yuz() {
        System.out.println("Kartal yüzüyor.");
    }
}
