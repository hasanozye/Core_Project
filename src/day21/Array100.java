package day21;

public class Array100 {
    public static void main(String[] args) {
        int[] numbers = {40,50,10,20,70};
//        System.out.println(numbers[4]);
        int arananDeger = 10;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==arananDeger){
                System.out.println("Aranan değer bulundu. NO : "+(i+1));
            }
        }


    }
}
