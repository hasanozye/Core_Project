
package day19;

import java.util.Scanner;

public class TaskAboutArray {
    public static void main(String[] args) {
        /*
        * Store grades of twelve students in an integer array variable. Write a Java program that finds the average of these grades.

grades: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45

average?*/
        int[] grades = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / 12.0;
        System.out.printf("Average = %.2f", average);

        Scanner scanner = new Scanner(System.in);
        int x =scanner.nextInt();



    }
}
