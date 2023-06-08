package day45;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp2 {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("files/deneme.txt");
            char[] buffer = new char[1024];
            int okunanMiktar = 0;


            while ((okunanMiktar = fr.read(buffer)) != -1) {
                for (int i = 0; i < okunanMiktar; i++) {
                    if (i % 80 == 0) System.out.println();
                    System.out.print(buffer[i]);

                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }

}
