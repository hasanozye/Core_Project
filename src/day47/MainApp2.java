package day47;

import java.util.Random;

public class MainApp2 {
    public static void main(String[] args) {
        /*
        Task: Bir dersi alan 1000 öğrenci vardır. Bu öğrenciler için 0-100 aralığında rastgele not üretilecektir.
        Hangi nottan kaç adet olduğunu gösteren grafiği ekrana çizdiriniz.
         */
        int[] notlar = new int[101];

        Random random = new Random();


        try {
            for (int i = 0; i < 1000; i++) {
                int not = random.nextInt(0, 101);
                notlar[not]++;
            }

            for (int i = 0; i < notlar.length; i += 10) {
                System.out.println(i + "\t" + "*".repeat(notlar[i]));
            }


        } catch (NullPointerException | ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }
}
