package day60.yaris;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {

    private Otomobil o1,o2;
    public Form() throws HeadlessException {
        super("Otomobil Yarışı");
        setLayout(null);
        setSize(800,600);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x =((screenSize.width-getWidth())/2);
        int y =((screenSize.height-getHeight())/2);
        setLocation(x,y);
        tasarla();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void tasarla() {
//        Otomobil 1
        o1 = new Otomobil();
        o1.setLocation(50,50);
        add(o1);
        //        Otomobil 2
        o2 = new Otomobil();
        o2.setLocation(50,120);
        add(o2);

    }
}
