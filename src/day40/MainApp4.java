package day40;

public class MainApp4 {
    public static void main(String[] args) {
//        Empty ve blank

        String str = " a ";

        if (str.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty ");
        }


        if (str.isBlank()){
            System.out.println("Blank");
        }else {
            System.out.println("Blank Değil");
        }


    }
}
