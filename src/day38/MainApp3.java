package day38;

public class MainApp3 {
    public static void main(String[] args) {
        String str = "Merhaba";
//    alt alta yazdırma



        /*for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }*/

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
//        Task: ey edip adanada pide ye
//        metnini tersten ekrana yazdıran java programını yazınız.

        String edip = "ey edip adanada pide ye";
        for (int i = edip.length()-1; i >= 0; i--) {
            System.out.print(edip.charAt(i)+" ");
        }
        
        
        

    }
    




}
