package day40;

public class MainApp {
    public static void main(String[] args) {
        // Concat
//        Task: ad ve soyad usulune uygunn şekilde birleştirilip, büyük karakterli olarak yazdırılacaktır.
        String str1 = "Ahmet";
        String str2 = "Dursun";
        String isim = str1
                .concat(" ")
                .concat(str2)
                .toUpperCase();


        System.out.println("isim = " + isim);
        System.out.println();
        System.out.println((str1 + " " + str2).toUpperCase());
        System.out.println();
        System.out.printf("%s %s\n".toUpperCase(), str1, str2);

        System.out.println(String.format("%s %s",str1,str2).toUpperCase());

    }
}
