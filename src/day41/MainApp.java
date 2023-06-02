package day41;

public class MainApp {
    public static void main(String[] args) {
//        StringBuffer

        StringBuffer sbf = new StringBuffer(50);

        sbf.append("Kardeş");
        sbf.append("Kardeş");
        sbf.append("Kardeş");
        sbf.append("Kardeş");
        sbf.append("Kardeş");
        sbf.append("Kardeş");
        sbf.append("Kardeş");
        sbf.append("Kardeş");
        sbf.append("Kardeş");

        sbf.trimToSize();


        System.out.println("sbf = " + sbf);
        System.out.println("Length : "+ sbf.length());
        System.out.println("Cpacity : "+sbf.capacity());









    }
}
