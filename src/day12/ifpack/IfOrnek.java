package day12.ifpack;

public class IfOrnek {
    public static void main(String[] args) {

        int age = 70;
        if (age<6){
            System.out.println("Merhaba bebek!");
        } else if (age < 13) {
            System.out.println("Merhaba çocuk!");
        } else if (age <= 18) {
            System.out.println("Merhaba Genç!");
        } else if (age < 40) {
            System.out.println("Merhaba Yetişkin");
        }else {
            System.out.println("Merhaba İhtiyar!");
        }

    }
}
