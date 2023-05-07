package Homeworks.day16;

public class Task1 {
    public static void main(String[] args) {
        /*Task1 :
         * 0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)*/
        //TODO: printf methoduyla doğru olcak şekilde for döngüsünü çöz.
        int counter = 0;
        int i;
        int numbers = 0;
        for (i = 0; i <= 20; i++) {
            counter++;
            if (i % 2 == 0) {
                numbers = i;
                System.out.printf("%d.Even Number: %d\n", counter, numbers);
            }

        }

        for (int j = 0; j <= 20; j +=2) {
            System.out.println(j);

        }
    }
}
