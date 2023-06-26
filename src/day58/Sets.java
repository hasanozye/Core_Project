package day58;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> kume = new HashSet<>();
        System.out.println("kume = " + kume);
        kume.add("Ahmet");
        kume.add("Seba");
        kume.add("Ayşe");
        kume.add("Hatice");
        kume.add("Hasan");
        System.out.println("kume = " + kume);
    }
}
