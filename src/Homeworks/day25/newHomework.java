package Homeworks.day25;

public class newHomework {
    public static void main(String[] args) {
        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye",
                "Biyoloji", "Cengiz", "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar",
                "Hasan", "Fizik", "Sezgin", "Biyoloji"};

        /*Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik

        biçiminde ekran çıktısı veren bir Java programı yazınız.*/
        System.out.println("Adı\tBölümü");
        String variable = "";

        for (int i = 0; i < data.length; i += 2) {
            System.out.print(data[i] + "\t" + data[i + 1] + "\n");


        }

    }
}
