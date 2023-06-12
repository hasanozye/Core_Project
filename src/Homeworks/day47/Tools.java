package Homeworks.day47;

public final class Tools {
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


    public static String splitWord(String word) {
        String result = "";
        try {
            int karakterAdedi = word.length();
            int orta = karakterAdedi / 2;

            orta = karakterAdedi % 2 == 0 ? orta : orta + 1;
            result = word.substring(0, orta) + "-" + word.substring(orta);

        } catch (NullPointerException | StringIndexOutOfBoundsException e) {

            System.err.println("Hata oluştu. Hata: " + e.getMessage());
        }


        return result;
    }


}
