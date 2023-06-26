package day58;

import java.text.Collator;
import java.util.Set;
import java.util.TreeSet;

public class Sets2 {
    public static void main(String[] args) {
        Set<String> tset = new TreeSet<>(Collator.getInstance());
        tset.add("Coşkun");
        tset.add("Necati");
        tset.add("Şahin");
        tset.add("Çağla");
        tset.forEach(item-> System.out.println(item));
    }
}
