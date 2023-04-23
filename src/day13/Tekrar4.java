package day13;

public class Tekrar4 {
    public static void main(String[] args) {
        //Relational Operators
//        int x = 5;
//        int y = 9;
//        boolean result = x > y ^ 7 > 11;
//        System.out.println("result = " + result);

        //   : 7 6 5 4 3 2 1 0
        //b1 : 0 0 0 0 0 1 0 1
        //b1 : 0 0 0 0 0 1 1 1
        //r& : 0 0 0 0 0 1 0 1
        //r| : 0 0 0 0 0 1 1 1
        //r^ : 0 0 0 0 0 0 1  0

        int b1 = 5;
        int b2 = 7;

        int result1 = b1 | b2;
        int result2= b1 & b2;
        int result3= b1 ^ b2;
        System.out.println("result3 = " + result3);
        System.out.println("result2 = " + result2);
        System.out.println("result1 = " + result1);



    }
}
