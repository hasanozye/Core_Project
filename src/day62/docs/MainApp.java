package day62.docs;

public class MainApp {
    private static int deger;

    public static void main(String[] args) {
//        System.out.println(topla(5, 3));
        Mathe m = new Mathe(5,3);
        System.out.println(m.topla());


        int x=5;
        int y = 7;
        int z = x+y;




    }



}

class Mathe {
    private final int x;
    private final int y;

    Mathe(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int topla() {
        return x + y;
    }


}
