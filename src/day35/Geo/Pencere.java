package day35.Geo;

import javax.swing.*;
import java.awt.*;

public class Pencere extends JFrame {
    private  JButton btnTamam;
    public Pencere(String title) throws HeadlessException {
        super(title);
        setSize(800,600);
        setLayout(null);

        btnTamam = new JButton("Tamam");
        btnTamam.setSize(80,30);
        setLocation(30,30);
        add(btnTamam);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);



    }
}
