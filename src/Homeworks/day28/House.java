package Homeworks.day28;

public class House {
    private int bedroom;
    private int bathroom;
    private String[] heating ={"Gas","Electric"};
    private boolean cooling;
    private boolean hasPool;

    public void heat(){
        System.out.println("The house is heated.");
    }

    public void runCoolingSystem(){
        if (cooling){
            System.out.println("Cooling system is working");
        }else {
            System.out.println("No Cooling System");
        }
    }

    public House() {

    }

    public House(int bedroom, int bathroom, String[] heating) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.heating = heating;
    }
}
