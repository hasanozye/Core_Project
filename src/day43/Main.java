package day43;

public class Main {
    public static void main(String[] args) {
//        Exceptions
        /*
        Keywords
        1. try
        2. catch
        3. finally
        4. throw
        5. throws

         */

//        Sıfıra bölme hatası
        /*int x = 7;
        int y = 0;
        try {
            System.out.println("Sonuç = " + (x / y));
        } catch (Exception exception) {
            System.err.println("exception = " + exception.getMessage());
        }*/
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));


    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1);

        return front + back;

    }
}
