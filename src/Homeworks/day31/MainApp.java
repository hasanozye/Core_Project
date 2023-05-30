package Homeworks.day31;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Daire...");
        Daire daire = new Daire(3.75);
        System.out.println("Yarıçap= " + daire.getYaricap());
        System.out.printf("Alan= %.2f ", daire.getAlan());
        System.out.println();

        System.out.println("Silindir...");
        Silindir silindir = new Silindir(5.55, 7.25);
        System.out.println("Yarıçap= " + silindir.getYaricap());
        System.out.println("Yükseklik= " + silindir.getYukseklik());
        System.out.printf("Alan= %.2f \n", silindir.getAlan());
        System.out.printf("Hacim= %.2f \n", silindir.getHacim());

    }
}
