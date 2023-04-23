package day13;

public class Tekrar5 {
    public static void main(String[] args) {
        //Şifrelemede xor kullanımı
        int data = 25;
        int key = 11;

        int sifreliData = data ^ key;
        System.out.println("sifreliData = " + sifreliData);

        int cozulenData = 18 ^ key;
        System.out.println("cozulenData = " + cozulenData);
        //Simetrik ve Asimetrik kripto
    }
}
