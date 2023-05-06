package day16;

public class Loops1 {
    public static void main(String[] args) {
        /*
         * Loops:
         * for, for-each
         * while
         * do..while*/

        //FOR Kullanımı
//    for(başlangıç_dğeri;şart;artış_miktarı){
//      }

//    Değişkenin değeri nasıl arttırılır?
        int x = 5;
        int y = 1;
//        x += 1;
//        System.out.println(x);
//        x++; suffix
//        ++x; prefix
//        Tek başına kullanıldığında hiçbir fark yoktur
        /*System.out.println("x = " + x);
        x++;
        ++x;*/
//        int z = x++ + ++y;
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }


    }


}
