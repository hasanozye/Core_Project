package day30.kutuphane;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Encapsulation: Paketleme, sarmalama
        /*
            public: Her yerden erişim sağlanır
            protected: Aynı package ve (alt sınıf başka package'Ta olsa bile)atası olduğu alt sınıflardan erişim sağlanır
            <default>: Aynı package içerisinden erişim sağlanır.
            private: Sadece sınıf içerisinden erişim sağlanır.
         */


        System.out.println("Kitap Giriş Ekranı");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kitabın Adı : ");
        String adi = scanner.nextLine();

        System.out.print("Yazarı : ");
        String yazari = scanner.nextLine();

        System.out.print("Sayfa Adedi : ");
        int sayfaAdedi = scanner.nextInt();

        Kitap kitap = new Kitap(adi,yazari,sayfaAdedi);

        kitap.kaydet();

    }


}
