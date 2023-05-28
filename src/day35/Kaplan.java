package day35;

public class Kaplan extends Hayvan implements Avci,Yuzucu{

    @Override
    public void avlan() {
        System.out.println("Kaplan avlanıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Kaplan yuzuyor.");
    }
}
