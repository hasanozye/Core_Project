package day17;

public class Task3 {
    public static void main(String[] args) {

        //update: problem çözüldü...

        System.out.println("KPH\t\tMPH");

        for (int i = 60; i <= 130; i += 10) {
            System.out.print(i + "\t\t");
            double mph = i * 0.6214;
            System.out.printf("%4.1f\n", mph);

        }
    }


}
