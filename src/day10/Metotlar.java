package day10;

public class Metotlar {
    public static void main(String[] args) {
//       Verilen bir sayının karesini hesaplayan Java programını yazınız.
        int number = 7;
        int kare = number * number;
        System.out.println("Sayının karesi = " + kare);
        System.out.println("---------------------------------");
        kareAl(9);



    }


    public static void kareAl(int number){
        int power = number*number;
        System.out.println("Power of the Number = " + power);
    }


}
