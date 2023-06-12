package Homeworks.day47;

public class MainApp2 {
    public static void main(String[] args) {

        try {
            System.out.println(splitWord("Ahmet"));
            System.out.println(splitWord("Gürhan"));
            System.out.println(splitWord(null));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }

    public static String splitWord(String word) throws Exception {
        if (word == null || word.isBlank()) throw new Exception("kelime boş olamaz.");
        String result = "";
        int orta = word.length() / 2;
        orta = word.length() % 2 == 0 ? orta : orta + 1;
        return word.substring(0, orta) + "-" + word.substring(orta);
    }
}
