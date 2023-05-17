package day25.geometriksekiller;

public class Kare {

    public int kenar;

    public void bilgiGoster() {
        System.out.printf("alan : %d\n", alanHesapla());
        System.out.printf("çevre : %d\n", cevreHesapla());
    }

    public int alanHesapla() {
        return kenar * kenar;
    }

    public int cevreHesapla() {
        return 4 * kenar;
    }

}


