package day10;

public class Metotlar3 {
    public static void main(String[] args) {
        int c1 = cevreHesapla(3);
        int c2 =cevreHesapla(8);
        int cevrelerToplami = c1+c2;
        int cevrelerFarki = c2-c1;
        System.out.println("cevrelerFarki = " + cevrelerFarki);
        System.out.println("cevrelerToplami = " + cevrelerToplami);

    }

    public static int cevreHesapla(int kenar) {
        return 4 * kenar;
    }

}
