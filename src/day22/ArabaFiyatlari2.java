package day22;

import java.util.Random;
import java.util.Scanner;

public class ArabaFiyatlari2 {
    public static void main(String[] args) {
//        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
//
//dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
//1. Honda
//2. Toyota
//...     şeklinde olacaktır.
//
//Listenin en altında kullanıcıdan seçim yapması istenilecektir.
//
//Kullanıcının seçtiği arabaya uygun fiyat;
//      Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
//Şeklinde gösterilecektir.
//
//Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
//Honda – Toyota – Nissan (Random price between 20000 and 40000)
//BMW-Mercedes(Random price between 50000 and 80000)
//Porsche - Ferrari(Random price between 100000 and 150000)
        do {


            String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
            int[] prices = new int[cars.length];

            // Araba listesini ekrana yazdır
            for (int i = 0; i < cars.length; i++) {
                System.out.println(i + 1 + ". " + cars[i]);
            }

            // Kullanıcıdan seçim yapmasını iste
            System.out.println("0. Çıkış");
            System.out.print("Lütfen Seçim yapınız (1-" + cars.length + "):");
            int secim = new Scanner(System.in).nextInt();

            //Araba fiyatlarını rastgele oluştur
            Random random = new Random();

            for (int i = 0; i < cars.length; i++) {
                if (i < 3) {
                    prices[i] = random.nextInt(20001) + 20000; // 20000-40000 arası fiyat
                } else if (i < 5) {
                    prices[i] = random.nextInt(30001) + 50000; // 50000-80000 arası fiyat
                } else {
                    prices[i] = random.nextInt(50001) + 100000; // 100000-150000 arası fiyat
                }
            }



            // Seçilen arabanın fiyatını göster
            if (secim >= 1 & secim <= 7) {
                String selectedCar = cars[secim - 1];
                int selectedPrice = prices[secim - 1];
                System.out.printf("Seçtiğiniz araba %s, fiyatı %d. İyi günlerde kullanın.", selectedCar, selectedPrice);
                break;

            } else if (secim == 0) {
                System.out.println("Program sonlandırıldı.");
                break;

            } else {
                System.out.println("Yanlış seçim yaptınız.");
            }
        } while (true);


    }

}
