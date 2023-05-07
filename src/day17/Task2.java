package day17;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Number\t->\tNumber Squared");
        System.out.println("-".repeat(26));
        int pow = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t\t->\t\t");
            pow = (int) Math.pow(i, 2);
            System.out.println(pow);


        }
    }
}
