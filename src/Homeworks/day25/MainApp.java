package Homeworks.day25;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Hasan", "Özyer", 23, new int[]{53, 16, 56});
        student.showInfo();

        Student student1 = new Student("Ahmet", "Demirel", 24, new int[]{13, 52, 41});
        student1.showInfo();

        double hasan = student.getGPA();
        double ahmet = student1.getGPA();
        double bigger;

        if (hasan > ahmet) {
            bigger = hasan;
        } else {
            bigger = ahmet;
        }
        System.out.printf("%.2f",bigger);

    }
}
