package day48;

public class MainApp {
    public static void main(String[] args) {
        /*
        1. Keywords: try-catch-finally-throw-throws
        2. Classes: Exception-NullPointerException-arrayIndexOutOfBoundException-...
        3. Hata Durumları
            a. Error: Sistem Hataları
            b. Exceptions
                1. Checked Exceptions: Compile-Design Time Exceptions
                2. Unchecked Exceptions: Runtime Exceptions
         */

        try{
            Kare k = new Kare(-7);
        }catch(LengthException e){
            e.printStackTrace();
        }

        /*
        1. Geometrik Şekillerde uzunluk için
        2. Yetersiz Bakiye
        3. Parola, Kullanıcı Adı
        4. Hatalı IBAN
        5. hatalı TCK no
        6. Aralık Dışı değer girilmesi
         */



    }
}
