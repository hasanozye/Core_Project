package day35.Geo;

import javax.swing.*;
import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        JFrame pencere = new JFrame("Geometrik Şekilleri V1.0");
        pencere.setSize(800,600);

        pencere.setLayout(null);
        JButton btn = new JButton("Tamam");
        btn.setSize(100,30);
        btn.setLocation(10,20);
        pencere.add(btn);


        Kare kare1 = new Kare(200);
        kare1.setLocation(120,20);
        pencere.add(kare1);

        JLabel lblAlan = new JLabel("Alan : "+kare1.getAlan());
        lblAlan.setLocation(330,20);
        lblAlan.setSize(200,30);
        pencere.add(lblAlan);

        JLabel lblCevre = new JLabel("Çevre : "+kare1.getCevre());
        lblCevre.setLocation(330,60);
        lblCevre.setSize(200,30);
        pencere.add(lblCevre);













        pencere.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }
}
