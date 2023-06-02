package day41;

public class MainApp3 {
    public static void main(String[] args) {
        Kitap k1 =new Kitap("Suç ve Ceza", "Dostoyevski", 300);
        Kitap k2 = k1.clone();

        System.out.println("k1 = " + k1);
        System.out.println("k2 = " + k2);
        System.out.println();
        k1.setSayfa(500);

        System.out.println("k1 = " + k1);
        System.out.println("k2 = " + k2);

        if (k1==k2){
            System.out.println("Aynı");
        }else {
            System.out.println("Farklı");
        }



    }
}
