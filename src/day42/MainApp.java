package day42;

public class MainApp {
    public static void main(String[] args) {
        Hali hali = new Hali(3.5);
        Zemin zemin = new Zemin("Mutfak",2.75, 4.0);
        Hesap hesap = new Hesap(zemin, hali);
        System.out.println(hesap);

        hali = new Hali(1.5);
        zemin = new Zemin("Salon",5.4, 4.5);
        hesap = new Hesap(zemin, hali);
        System.out.println(hesap);
    }
}
