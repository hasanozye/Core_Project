package day21;

public class NestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print("\t");
            }
            System.out.println();
        }
        final int NUMBER_OF_STARS = 7;

        for (int i = 1; i <=NUMBER_OF_STARS; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();


        }




    }
}
