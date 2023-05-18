package Homeworks.day25;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Hasan", "Özyer", 23, new int[]{503, 50, 100});
        student.showInfo();

        Student student1 = new Student("Ahmet", "Demirel", 24, new int[]{1003, 50, 40});
        student1.showInfo();

        double hasan = student.getGPA();
        double ahmet = student1.getGPA();
        double bigger;

        if (hasan > ahmet) {
            bigger = hasan;
        } else {
            bigger = ahmet;
        }
        System.out.println(bigger);

    }
}
