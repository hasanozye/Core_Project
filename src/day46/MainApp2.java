package day46;

import java.io.File;

public class MainApp2 {
    public static void main(String[] args) {
        File file = new File("files/");
        if (file.isFile()) {
            System.out.printf("%s bir dosyadır.\n", file.getName());
        } else if (file.isDirectory()) {
            System.out.printf("%s bir klasördür.\n", file.getName());
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f.getName());
            }
        }

    }
}
