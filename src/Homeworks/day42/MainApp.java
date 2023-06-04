package Homeworks.day42;

public class MainApp {
    public static void main(String[] args) {
        Point p1 = new Point(7, 4);
        Point p2 = new Point();
        p2.setX(8);
        p2.setY(3);

        Point p3 = new Point(4, 4);
        double mesafe12 = p1.calculateDistance(p2);
        System.out.println("Mesafe p1-p2: " + mesafe12);
        System.out.println();
        double mesafe3d = p3.calculateDistance(5, 4);
        System.out.println("Mesage p3-diğer 5,4:" + mesafe3d);


    }
}
