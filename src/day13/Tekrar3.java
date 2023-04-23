package day13;

public class Tekrar3 {
    public static void main(String[] args) {
        //(Birleşik) Atamam Operatörleri
        int x1 = 7;
        int x2 = 9;
        int x3 = 11;
//        int toplam = x1+x2+x3;
        int toplam = 0;
//        toplam = toplam +x1;
        toplam += x1;
        toplam += x2;
        toplam += x3;

        System.out.println(toplam);
        //5!;
        int faktoriyel = 1;
        faktoriyel *= 1;
        faktoriyel *= 2;
        faktoriyel *= 3;
        faktoriyel *= 4;
        faktoriyel *= 5;

        System.out.println("faktoriyel = " + faktoriyel);


    }
}
