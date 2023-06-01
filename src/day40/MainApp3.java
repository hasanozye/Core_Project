package day40;

public class MainApp3 {
    public static void main(String[] args) {
//      replace

        String isim = "Mehmet Ali Erbil";
        String replaced = isim.replace('e', 'i');
        System.out.println("replaced = " + replaced);
        String replaced1 = isim.replace("Erbil", "Birand");
        System.out.println("replaced1 = " + replaced1);
        System.out.println(isim);

    }
}
