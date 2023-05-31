package day39;

public class MainApp6 {
    public static void main(String[] args) {
        /*
            TASK:
            1. Verilen bir metindeki kelime adedini döndüren metodu yazınız. (countWords)
            2. Örnek bir metnin kelimelerini saydırıp, ekrana yazdırınız.
         */
        System.out.println(countWords(" Reisül ekber napmaktadrı? what the fakh is actual going on lol."));




    }

    public static int countWords(String metin) {

        String trimmed = metin.trim();
        String[] word = trimmed.split(" ");
        int countedWord = word.length;


        return countedWord;
    }


}