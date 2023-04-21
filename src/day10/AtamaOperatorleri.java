package day10;

public class AtamaOperatorleri {
    public static void main(String[] args) {
        /*
        Atama Operatörleri
        =   : Sağındakin Literal, değişken veya herhangi bir Expression'ın sonucu (result) solunda bulunan değişkene kaydeder (atama yapar).
        +=
        -=
        *=
        /=
        %=
         */
        int x = 5;
        String name = "Ali";
        int y = x + 7;
        int z = x - 54;
        System.out.println("z = " + z);

        // Bir değişkenin değerini artırıp tekrar aynı değişken içersinde saklamak
        int t = 1;
//        t = t + 1;
        t += 1;
//        t = t + 3;
        t += 3;

        // Bir değişkenin değerini eksiltip tekrar aynı değişken içersinde saklamak,
        int k = 7;
//        k = k-2;
        k -= 2;

        // Bir değişkenin değerini bir sayı ile çarpıp tekrar aynı değişken içersinde saklamak
        int m = 8;
//        m = m * 2;
        m *= 2;

        // Bir değişkenin değerini bir sayıya bölüp tekrar aynı değişken içersinde saklamak
        int b = 27;
//        b = b / 3;
        b /= 3;

        // Bir değişkenin değerinin modunu alıp tekrar aynı değişken içersinde saklamak
        int md = 11;
//        md = md % 2;
        md %= 2;






    }
}
