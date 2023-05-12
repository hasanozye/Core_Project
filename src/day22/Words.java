package day22;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Cümle : ");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }*/
        String cumle = "Video, size görüşünüzü kanıtlamak için güçlü bir yol sunar.";
        Scanner scanner = new Scanner(cumle);
        System.out.print("Cümle : ");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
