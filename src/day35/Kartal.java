package day35;

public class Kartal extends Hayvan implements Avci, Yuzucu, Ucucu{

    @Override
    public void avlan() {
        System.out.println("Kartal");
    }

    @Override
    public void yuz() {
        System.out.println("Kartal yüzüyor.");
    }

    @Override
    public void uc() {
        System.out.println("Kartal uçuyor.");
    }
}
