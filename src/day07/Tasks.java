package day07;

public class Tasks {
    public static void main(String[] args) {
        //Benim adım Hasan ve 22 Yaşındayım
        //Önce bu şekliyle ekrana yazdırılacak. Daha sonra isim ve yaş değiştirilip tekrar yazdırılacak.
        String first = "Benim adım";
        String name = " Hasan";
        String and = " ve";
        int age = 22;
        String yo = " yaşındayım.";

        System.out.println(first + name + and + " " + age + yo);

        name = " Sinan";
        age = 24;
        System.out.println(first + name + and + " " + age + yo);

        double agirlik = 3.5;
        float agirlik2 = 42.1F;

        boolean buyukMu = 5 > 3;
        System.out.println("buyukMu = " + buyukMu);

        buyukMu = 2 > 8;
        System.out.println("buyukMu = " + buyukMu);

        String mesaj = "Bu bir " + "deneme mesajıdır.";
        System.out.println(mesaj);

        char ch =0x65;
        int x = 0x41;

        System.out.println(x);
        System.out.println(ch);

        int price,quantity,total;
        price=5;
        quantity=14;
        total = price+quantity;
        System.out.println("price = " + price);
        System.out.println("quantity = " + quantity);
        System.out.println("total = " + total);
    }
}
