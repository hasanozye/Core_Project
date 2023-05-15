package day23;

import java.util.Scanner;

public class CarTask {
    public static void main(String[] args) {
        //Beş elemanlı arabalar dizisi oluşturunuz.
//        Kullanıcıdan aradığı arabanın ismini isteyiniz.
//        Bulunca mesela aradığınız araç bulundu veya araç bulunamadı mesajı veren Java programı yazınız.

                // Araba dizisini oluştur
                String[] arabalar = {"BMW", "Mercedes", "Audi", "Toyota", "Honda"};

                // Kullanıcıdan aradığı arabanın ismini iste
                Scanner scanner = new Scanner(System.in);
                System.out.print("Aramak istediğiniz arabanın ismini girin: ");
                String arananAraba = scanner.nextLine();

                // Arabayı dizide ara
                boolean arabaBulundu = false;
                for (String araba : arabalar) {
                    if (araba.equalsIgnoreCase(arananAraba)) {
                        arabaBulundu = true;
                        break;
                    }
                }

                // Sonuç mesajını yazdırr
                if (arabaBulundu) {
                    System.out.println("Aradığınız araç bulundu!");
                } else {
                    System.out.println("Aradığınız araç bulunamadı.");
                }
            }
        }