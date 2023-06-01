package day40;

public class MainApp5 {
    public static void main(String[] args) {
//        StringBuilder, StringBuffer
        StringBuilder sb = new StringBuilder("Merhaba!");

        sb.append("Nasılsın?");
        sb.append(5);

        sb.insert(8,"Kardeş.");

//        sb.reverse();

        System.out.println(sb);

        sb.delete(8,15);
        System.out.println(sb);

        System.out.println(new StringBuilder("Ey edip adanada pixde ye").reverse());


        System.out.println("sb = " + sb);

        System.out.println(new StringBuilder()
                .append("Merhaba")
                .insert(0,"Ahmet")
                .reverse());






    }
}
