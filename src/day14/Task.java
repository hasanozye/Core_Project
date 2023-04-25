package day14;

public class Task {
    public static void main(String[] args) {
        /*
        İki tamsayı değişkene değerleri assign ediniz. Önce bunları isimleri ve değerleriyle birlikte ekrana yazdırınız.
        Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.
         */

        int x = 7;
        int y = 5;
        System.out.printf("x = %d\n", x);
        System.out.printf("y = %d\n", y);

        int z = x;
        x = 5;
        y = 7;
        System.out.printf("x = %d\n", x);
        System.out.printf("y = %d\n", y);

    }
}
