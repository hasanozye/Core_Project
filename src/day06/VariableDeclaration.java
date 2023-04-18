package day06;

public class VariableDeclaration {
    double PI_NUMBER = 3.14;

    public static void main(String[] args) {
        //Dikdörtgenin alan ve çevre hesabını yapan bir Java programı geliştiriniz.
        //Değişken tanımlamalarında türkçe karakterleri kullanmayınız: ığĞüÜşŞİöÖçÇ
//        Notations:
//        1. Camel Notation: kisaKenar , uzunKenar
//        2. Pascal Notation: VariableDeclaration
//        3. Snake Notation: PI_NUMBER


//        Çevre hesabı: 2 x ( Kısa Kenar + Uzun Kenar)
//        Alan Hesabı: Kısa Kenar x Uzun Kenar
        int kisaKenar = 7 + 5 - 5 + 8 - 4 - 4;
        int uzunKenar = 12 - 1;
        int dikdodtgeninCevresi = 2 * (kisaKenar + uzunKenar); //statement
        int dikdortgeninAlani = kisaKenar * uzunKenar;

        //Concatenation
        System.out.println("Kısa Kenar : " + kisaKenar);
        System.out.println("Uzun Kenar : " + uzunKenar);
        System.out.println();
        System.out.println("Dikdörtgenin Çevresi = " + dikdodtgeninCevresi);
        System.out.println("Dikdörtgenin Alanı = " + dikdortgeninAlani);

    }
}
