package day17;

public class Task3 {
    public static void main(String[] args) {
        double kph = 1;
        double mph = kph * 0.6214;
        double random = 60;
        //TODO: BU PROBLEM ÇÖZÜLCEK!

        System.out.println("KPH\t\tMPH");
        for (int i = 60; i <= 130; i += 10) {
            System.out.println(i + "\t");
            kph = random;
            System.out.printf("%.1f",mph);
            random+=10;

        }
    }


}
