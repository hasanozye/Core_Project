package day17;

public class ForLoop1 {
    public static void main(String[] args) {
        /*
        Write a program that displays all odd numbers between 5-140 in same line.
         */
        int count = 0;
        for (int i = 5; i < 140; i += 2) {
            System.out.print(i + "\t");
            if (++count % 10 == 0) {
                System.out.println();
            }
        }


    }
}
