package day58;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        /*
        Stack: LIFO, yani son giren ilk çıkar
         */

        Stack<String> kitaplar = new Stack<>();
        System.out.println("kitaplar = " + kitaplar);
        kitaplar.push("Java 8");
        kitaplar.push("Python");
//        System.out.println(kitaplar.empty());
        if (!kitaplar.empty()) System.out.println("kitaplar = " + kitaplar);

        try{
            System.out.println(kitaplar.peek());
            System.out.println(kitaplar.peek());
            System.out.println(kitaplar.peek());
            System.out.println(kitaplar.peek());
            System.out.println(kitaplar);
            String kitap = kitaplar.pop();
            System.out.println("Pop edilen: "+kitap);
            System.out.println("Liste : "+kitaplar);
            System.out.println(kitaplar.pop());
            System.out.println("Kalan :"+kitaplar);
            System.out.println("-".repeat(20));
//        System.out.println(kitaplar.peek());
            System.out.println(kitaplar.pop());

        }catch(EmptyStackException e){
            e.printStackTrace();

        }
        }
}
