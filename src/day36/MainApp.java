package day36;

public class MainApp {
    public static void main(String[] args) {
        //Strings - Meting dizileri
//        basitçe bir char dizisidir denilemez.
//        Stringler immutable dir. Yani değiştirelemezler
        String str1 = "Java";
        System.out.println("str1 = " + str1);
        str1 = str1.toUpperCase();

//        String upperCase = str1.toUpperCase();
        System.out.println("str1 = " + str1);
//        System.out.println("upperCase = " + upperCase);


    }
}
