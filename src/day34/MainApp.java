package day34;

public class MainApp {
    public static void main(String[] args) {
//        Jagged Diziler eleman sayıları farklı olan dizilerin dizisidir.
//        int[][] notlar = new int[5][3];

/*
        String[][] zaman = new String[3][];

//        Haftanın günleri
        zaman[0] = new String[7];
        zaman[0][0] = "Pazartesi";
        zaman[0][1] = "Salı";
        ...

//        Yılın ayları
        zaman[1] = new String[12];
        zaman[1][0] = "Ocak";
        ...

//        Mevsimler
        zaman[2] = new String[4];
        zaman[2][0] = "İlkbahar";
        ...
        */
        String[][] zaman = {
                {"Pzt", "Sal", "Çar", "Per", "Cum", "Cts", "Pzr"},
                {"Ocak", "Şub", "Mar", "Nis", "May", "Haz", "Tem", "Ağu", "Eyl", "Eki", "Kas", "Ara"},
                {"İlkbahar", "Yaz", "Sonbahar", "Kış"},

        };
        System.out.println(zaman.length);

        System.out.println("İlk Eleman : " + zaman[0].length + " elamanlıdır.");
        System.out.println("İkinci Eleman : " + zaman[1].length + " elamanlıdır.");
        System.out.println("Üçüncü Eleman : " + zaman[2].length + " elamanlıdır.");


        int toplamElemanSayisi = 0;
        for (int i = 0; i < zaman.length; i++) {
            toplamElemanSayisi += zaman[i].length;
        }
        System.out.println("toplamElemanSayisi = " + toplamElemanSayisi);

        System.out.println("-".repeat(30));
        for (int i = 0; i < zaman.length; i++) {
            for (int j = 0; j < zaman[i].length; j++) {
                System.out.print(zaman[i][j]+",\t");
            }
            System.out.println();
        }


    }
}
