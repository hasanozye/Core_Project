package day11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
            TASK: Klavyeden iki ayrı kareye ait kenar bilgisi girilecektir.
            Her iki karenin alanının hesaplayan metodu yazınız. Elde edilen sonuçcları kıyaslayıp
            hangi karenin alanının büyük olduğunun belirtiniz.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk karenin kenar bilgisini giriniz; ");
        int ilkKareKenari = scanner.nextInt();
        System.out.print("İkinci karenin kenar bilgisini giriniz; ");
        int ikinciKareKenari = scanner.nextInt();

        int alan1 = kareAlanHesaplama(ilkKareKenari);
        int alan2 = kareAlanHesaplama(ikinciKareKenari);

        System.out.println("alan1 = " + alan1);
        System.out.println("alan2 = " + alan2);

        if (alan1 > alan2) {
            System.out.println("İlk girilen Karenin alanı İkinciden Büyüktür.");
        } else if (alan1 < alan2) {
            System.out.println("İkinci girilen karenin alanı ilkinden büyüktür.");
        } else {
            System.out.println("Karelerin alanları birbirlerine eşittir.");
        }


    }

    public static int kareAlanHesaplama(int kenar) {
        return kenar * kenar;
    }

}
