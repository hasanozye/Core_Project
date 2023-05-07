package day17;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a program that displays sum of even and odd numbers between 1 and 100 excluding 100
        */
        int evenSum = 0;
        int addSum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                addSum += i;
            }

        }
        System.out.println("addSum = " + addSum);
        System.out.println("evenSum = " + evenSum);


    }
}
