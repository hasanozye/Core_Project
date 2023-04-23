package day13;

public class Tekrar {
    public static void main(String[] args) {
        /*
        Osman Durmuş eski bir Milletvekili idi. Şu an 59 yaşındadır.
        Kamer Genç eski bir milletvekili idi. Şu an 70 yaşındadır.
         */
        String osmanIsim = "Osman Durmuş";
        int osmanYas = 59;

        String kamerIsim = "Kamer Genç";
        int kamerYas = 70;


        String mesaj;

        mesaj = String.format("%s eski bir Milletvekilidir. Şu an %d yaşındadır.", osmanIsim, osmanYas);
        System.out.println(mesaj);

        mesaj = String.format("%s eski bir Milletvekilidir. Şu an %d yaşındadır.", kamerIsim, kamerYas);
        System.out.println(mesaj);
    }
}
