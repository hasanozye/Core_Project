package day45;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        /*
        1. try-catch
        2. try-cath-catch
        3. try-cathch-final

        checked except,pn
         */

        char[] buffer = new char[1024];

        try {

            FileReader fr = new FileReader("files/deneme.txt");
            int okunanMiktar = fr.read(buffer);
            System.out.println("Okunana karakter adedi: " + okunanMiktar);
            for (int i = 0; i < okunanMiktar; i++) {
                System.out.print(buffer[i]);
            }
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

        /*
         catch ( IOException | ArrayIndexOutOfBoundsException | NullPointerException exception) {
            System.err.println(exception.getMessage());
        }
         */

    }
}
