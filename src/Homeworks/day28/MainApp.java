package Homeworks.day28;

public class MainApp {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House(3,1,new String[]{"xx","xxa"});

        house1.heat();
        house1.runCoolingSystem();

        house2.heat();
        house2.runCoolingSystem();

    }
}
