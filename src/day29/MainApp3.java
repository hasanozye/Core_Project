package day29;

public class MainApp3 {
    public static void main(String[] args) {
        Hayvan hy = new Kedi();
        Kedi k = (Kedi) hy;
        ((Kedi)hy).avlan();
    }
}
