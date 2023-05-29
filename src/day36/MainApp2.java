package day36;

public class MainApp2 {
    public static void main(String[] args) {
//        String Pool
        String str1 = "Python";
        String str2 = "Data Science";
        String str3 = "Python";

        String str4 = new String("Java");
        String str5 = new String("C++");
        String str6 = new String("Data Science");
        String str7 = new String("Data Science").intern();

        String str8 = new String("Python");


        if (str1 == str2) {
            System.out.println("Str 1 ve str2 aynıdır.");
        } else {
            System.out.println("Str 1 ve str 2 farklıdır.");
        }

        if (str1 == str3) {
            System.out.println("Str 1 ve str3 aynıdır.");
        } else {
            System.out.println("Str 1 ve str3 farklıdır.");
        }

        if (str1 == str8) {
            System.out.println("Str 1 ve str8 aynıdır.");
        } else {
            System.out.println("Str 1 ve str8 farklıdır.");
        }

        if (str8.equals(str8)) {
            System.out.println("Str 1 ve str8 içerik olarak aynıdır.");
        } else {
            System.out.println("Str 1 ve str8 içerik olarak farklıdır.");
        }


    }
}
