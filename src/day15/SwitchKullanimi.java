package day15;

public class SwitchKullanimi {
    public static void main(String[] args) {
        int gun = 8;
        switch (gun) {
            case 1:
                System.out.println("Pazartesi3");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlış seçim.");


        }
        //break imleci buraya atar
        System.out.println("Exited from switch.");
    }
}
