package day41;

import java.util.Arrays;

public class Mainapp2 {
    public static void main(String[] args) {
        Kitap[] kitaplar = {
                new Kitap("Suç ve Ceza", "Dostoyevski", 300),
                new Kitap("Sefiller", "Victor Hugo", 500),
                new Kitap("Kaşağı","Ömer Seyfettin",270)

        };

        Arrays.sort(kitaplar);



        int[] sayilar = {4, 1, 8, 7, 3, 11};
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(kitaplar));


    }
}
