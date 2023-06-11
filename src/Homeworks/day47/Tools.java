package Homeworks.day47;

public final class Tools {
    public static void main(String[] args) {
        /*
        Lütfen aşağıda belirtilen görevleri yerine getiriniz.
Tools isimli final bir sınıf tasarlayınız.
Bu sınıfta aşağıda belirtilen static metot(lar) bulunacaktır.
String splitWord(String word) metodu
word, ortadan ikiye bölünüp part1-part2 şeklinde döndürülecektir.
Kelime uzunluğu tek sayı ise büyük olan part1'de kalacaktır.
word, null-boş-boşluk(lar)'dan oluşamaz.
NullPointerException ve StringIndexOutOfBoundsException ile muhtemel hatalar yönetilecektir.
splitWord metodu, main metodu içerisinde iki kez kullanılıp, ekran çıktısı alıncaktır.
Örnek kullanım;
INPUT : splitWord("Dursun")
OUTPUT: Dur-sun
         */
        System.out.println(splitWord("hasanbabaa"));

    }



    public static String splitWord(String word) {
        String part1 = "";
        String part2 = "";
        String bigSt = part1;
        String index = "" + word.charAt(word.length() / 2);
        int ind = word.indexOf(index);

        if (word.length() % 2 == 0) {
            part1 = word.substring(0, (word.length() / 2));
            part2 = word.substring(ind);
            return part1 + "-" + part2;
        }
        if (word.length() % 2 == 1){
            
        }

        if (part2.length() > part1.length()) {
            return bigSt + "-" + part2;

        }

        return part2 + "-" + part1;
    }


}
