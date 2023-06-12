package day47;

import day20.Arrays;

public class MainApp {
    public static void main(String[] args) {
        /*
        Task 1: Verilen bir String dizisinin içeriğini ekrana bastıran metodu yazınız.
        - Method: void showContent(String[] values)
        - Metot içerisinde iki adet uncheck Exception kullanılacaktır.
        - NullPointerException - ArrayIndexOutOfBoundException
        - try - catch -catch
         */
        showContent(new String[]{"hasan", "baba", "king", "wassup men"});
        showContent(null);


    }

    public static void showContent(String[] values) {
        String[] result;
        try {
            result = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                result[i] = values[i];
                System.out.printf("Dizinin " + (i + 1) + ". elemanı -> %s\n", result[i]);
            }

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof NullPointerException)
                System.err.println("Girilen string değeri boş olamaz." + ((NullPointerException) e).getMessage());

            else {
                System.err.println("Array seçili değerleri aşıyor." + ((ArrayIndexOutOfBoundsException) e).getMessage());
            }

        }


    }


}
