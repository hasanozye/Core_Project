package day13;

import java.util.Objects;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Klavyeden userName ve password bilgisi alıancaktır.
        Eğer iki veri doğru ise "Yönetim sayfasına hoşgeldiniz" mesajı verilecektir.
        Eğer parola yanlış ise "Yanlış girdiniz. Lütfen tekrar deneyiniz." mesajı verilecektir.
        Eğer kullanıcı adı yanlış giirlmiş ise "Lütfen Sistem yöneticisi ile irtibat kurunuz" mesajı verilecektir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Username giriniz : ");
        String username = scanner.nextLine();

        System.out.print("Lütfen password giriniz: ");
        String password = scanner.nextLine();

        if (Objects.equals(username, "Hasan") & Objects.equals(password, "Özyer")) {
            System.out.println("Yönetim sayfasına hoşgeldiniz");

        } else if (!(Objects.equals(username, "Hasan"))) {
            System.out.println("Lütfen Sistem yöneticisi ile irtibat kurunuz");
        } else if (!(Objects.equals(password, "Özyer"))) {
            System.out.println("Yanlış girdiniz. Lütfen tekrar deneyiniz.");

        }

    }
}
