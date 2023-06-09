package day46;

import java.io.File;
import java.io.FileReader;

public class MainApp {
    public static void main(String[] args) {
    /*
    1. try-catch
    2. try-catch-catch
    3. try-catch-finally
     */
        File file = new File("files/metin2.txt");

        if (file.exists()){
            System.out.println("Dosya bulundu.");
            if (file.delete()){
                System.out.println("Dosya silindi");
            }
        }else {
            System.out.println("Dosya bulunamadı.");
        }

    }



}
