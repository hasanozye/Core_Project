package day21;

public class ForWhile {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i%2 == 0){
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
