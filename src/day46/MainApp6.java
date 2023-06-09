package day46;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp6 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("file/metin.txt")){
            fr.read();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
