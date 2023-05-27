package day34;

public class MainApp1 {
    public static void main(String[] args) {
//        Jagged Diziler
        /*
        1. Oturum: Dr. Ahmet, Doç. Şengül
        2. Oturum: Şahin, Eren, Fatoş
        3. Oturum: Hasan, Zeliha, Hakan, Burhan



         */
        String[][] panelistler = {
                {"Dr. Ahmet", "Doç. Şengül"},
                {"Şahin", "Eren", "Fatoş"},
                {"Hasan", "Zeliha", "Hakan", "Burhan"},
        };

        for (int i = 0; i < panelistler.length; i++) {
            System.out.println(panelistler[i][1]);
        }
    }
}