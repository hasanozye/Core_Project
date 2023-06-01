package day40;

public class MainApp2 {
    public static void main(String[] args) {
//        Contains

        String str = "Ben bir garip keloğlanım.";
//        boolean kelVarMi  = str.contains("kel");


        boolean kelVarMi = str.toLowerCase().contains("KEL".toLowerCase());

        if (kelVarMi){
            System.out.println("Kel var.");
        }





    }
}
