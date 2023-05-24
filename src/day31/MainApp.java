package day31;

public class MainApp {
    public static void main(String[] args) {
        Uye uye1 = new Uye();
        Kitap k1 = new Kitap("Sefiller","VictorHugo",500);
        Kitap k2 = new Kitap("Kaşağı","Ö. Seyfettin",12);
        uye1.kitapAl(k1);
        uye1.kitapAl(k2);
    }
}
