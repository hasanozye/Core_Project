package day33.Array2D;

import java.util.Arrays;

public class MainApp2 {
    public static void main(String[] args) {
        //2d Arrays
        int[][] sayilar = new int[5][];
        System.out.println(sayilar[1]);
        sayilar[0] = new int[2];
        sayilar[1] = new int[2];
        sayilar[2] = new int[2];
        sayilar[3] = new int[2];
        sayilar[4] = new int[2];

        System.out.println(sayilar[1]);
        System.out.println(Arrays.toString(sayilar[1]));
        sayilar[1][0] = 56;
        int x = sayilar[1][0];
        System.out.println(x);


    }
}
