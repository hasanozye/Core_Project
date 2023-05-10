package day20;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers= {2,4,6,8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        numbers[1] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
