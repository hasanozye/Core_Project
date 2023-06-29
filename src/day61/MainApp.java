package day61;

import com.sun.source.tree.UsesTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {
    public static void main(String[] args) {
        String regex = "\\w+";
        String str = "Bu mesaj deneme amacıyla yazılmıştır.";
 
        Pattern pattern = Pattern.compile(regex,Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);
        /*if (matcher.find()){
            System.out.println("Eşleşme var.");
        }else{
            System.out.println("Eşleşme yok. ");
        }*/
        while (matcher.find()) {
            System.out.println("Eşleşme : " + matcher.group(0));
        }
    }
}
