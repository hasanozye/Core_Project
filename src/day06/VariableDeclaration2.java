package day06;

public class VariableDeclaration2 {
    public static void main(String[] args) {
        int age = 30;

//        Aşağıdaki satırın tamamı bir java statement'ıdır.
//        Eşittir operatörünün sağında bulunan yaş+7 ise bir expression'dır.
        age = age + 6;
        System.out.println("Age = " + age);
    }
}
