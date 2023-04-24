package day14;

public class IfStatement {
    public static void main(String[] args) {
        /*
        Akış (Flow ) kontrol ifadeleri
        if      :
        switch  :
        for     :
        while   :
         */
        int x = 0;
        int y = 10;
        if (y == 20) {
            x = 5;

        }
        System.out.println("x = " + x);
        /*
        Write an if statement that multiplies payrate by 1.5 if hours is greater than 40;
         */

        int hours = 43;
        double payRate = 15;
        if (hours > 40) {
            payRate *= 1.5;
        }
        System.out.println("payRate = " + payRate);

        /*
        Write an if statement that sets the variable fees to 50 if the Boolean variable max is true;
         */

        int fees = 0;
        boolean max = true;
        if (max) {
            fees = 50;
        }
        System.out.println("fees = " + fees);

        /*
        Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100;
         */

        int a = 0;
        int b = 50;
        int c = 919;
        if (b == 50 & c >= 100) {
            a = 20;
        }
        System.out.println("a = " + a);

        double tempature = 75.5;
        if (tempature >= 70 & tempature <= 80) {
            System.out.println("tempature = " + tempature);
        }


    }
}
