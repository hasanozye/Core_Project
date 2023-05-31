package day39;

public class MainApp {
    public static void main(String[] args) {
        //          0 1 2 3 4 5 6 7 8 9 10 11 12  13 14
        //          M e r h a b a   K a  r  d  e  ş   !
        //length ve trim metotları
        String str="                       Merhaba    \t\t\n                 Kardeş!      ";
        System.out.println(str.length());
        System.out.println(str);
        System.out.println();
        String trimStr = str.trim();
        System.out.println(trimStr.length());
        System.out.println(trimStr);
    }
}