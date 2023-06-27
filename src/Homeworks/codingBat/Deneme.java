package Homeworks.codingBat;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {

//        Given a string, return a new string where the first and last chars have been exchanged.
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));

    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            String middleChars = str.substring(1, str.length() - 1);
            return lastChar + middleChars + firstChar;
        }

        
    }
}