package day40;

public class Tools {
    public static void main(String[] args) {
        /*
        Task 1: Verilen bir karakter dizisini (char[]) metne çevirip döndüren metodu yazınız.
                Method: String convertToString(char[] values)
         */

        char[] values = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(converToString(values));

        int[] valuesInt = {2, 131, 54, 45, 21};
        System.out.println(convertToString(valuesInt));

    }


    public static String converToString(char[] values) {

        String converted = "";

        for (int i = 0; i < values.length; i++) {
            converted += values[i];
        }
        return converted;
    }

    public static String convertToString(int[] values) {
        String str = "";
        for (int i : values) {
            str += i;
        }
        return str;
    }
}

