package day46;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1: Kayıtlı bir dosyanın var olup olmadığını kontrol edip silen Java programını yazınız.
        Dosya'ya erişip, ekranda gösteriecek, Silmek ister misiniz diye sorulacak
        Cevap evet ise dsya silinecek. Başarılı şekilde silindi mesajı verilecektir.
         */
        String fileName = "files/deneme.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);
        if (file.exists()) {
            System.out.printf("This file %s exists, do you want to delete it?\n", file.getName());
            if (scanner.next().equalsIgnoreCase("evet")) {
                file.delete();
                if (!file.exists()) {
                    System.out.println("File is deleted succesfully.");
                }
            }
        }


    }
}
