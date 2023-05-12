package day22;

import java.util.Random;
import java.util.Scanner;

public class ArabaFiyatlari {
    public static void main(String[] args) {
        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        int[] prices = new int[cars.length];
        Random random = new Random();

        // Araba fiyatlarını rastgele oluştur
        for (int i = 0; i < cars.length; i++) {
            if (i < 3) {
                prices[i] = random.nextInt(20001) + 20000; // 20000-40000 arası fiyat
            } else if (i < 5) {
                prices[i] = random.nextInt(30001) + 50000; // 50000-80000 arası fiyat
            } else {
                prices[i] = random.nextInt(50001) + 100000; // 100000-150000 arası fiyat
            }
        }

        // Araba listesini ekrana yazdır
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d. %s\n", i + 1, cars[i]);
        }

        // Kullanıcıdan seçim yapmasını iste
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir araba seçin (1-" + cars.length + "): ");
        int choice = scanner.nextInt();

        // Seçilen arabanın fiyatını göster
        String selectedCar = cars[choice - 1];
        int selectedPrice = prices[choice - 1];
        System.out.printf("Seçtiğiniz araba %s, fiyatı %d. İyi günlerde kullanın.\n", selectedCar, selectedPrice);
    }
}
