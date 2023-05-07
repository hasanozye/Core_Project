package Homeworks.day16;

public class Task2 {
    public static void main(String[] args) {
        /*
         * 0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programınız yazınız.
         * */
        /*int sum = 0;
        for (int i = 1; i < 20; i += 2) {
            sum += i;
        }
        System.out.printf("The addings of odds from 1 to 20 is %d. ",sum);
*/
        int n = 20/2;
        int sum = n*n;
        System.out.println("sum = " + sum);
    }
}
