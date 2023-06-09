package day48.editor;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Editor extends JFrame {

    private JMenuBar menuCubugu;
    private JMenu dosya;

    private JMenuItem ac, kaydet, cikis;

    private JTextArea icerik;

    public Editor() throws HeadlessException {
        super("Metin Düzenleyici v1.0");
        setSize(800, 600);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        setLocation(x, y);

        menuTasarla();

        icerik = new JTextArea();
        add(icerik);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void menuTasarla() {

        //Menü Çubuğu
        menuCubugu = new JMenuBar();

        dosya = new JMenu("Dosya");

        //Aç Menü Elemanı
        ac = new JMenuItem("Aç");
        ac.addActionListener(e -> dosyaAc());
        dosya.add(ac);


        //Kaydet Menu Elemanı
        kaydet = new JMenuItem("Kaydet");
        kaydet.addActionListener(e -> dosyaKaydet());
        dosya.add(kaydet);

        //Ayraç
        dosya.addSeparator();


        //Çıkış Menü Elemanı
        cikis = new JMenuItem("Çıkış");
        cikis.addActionListener(e -> cikisYap());
        dosya.add(cikis);

        menuCubugu.add(dosya);
        setJMenuBar(menuCubugu);

    }

    private void dosyaKaydet() {
        JFileChooser fcKaydet = new JFileChooser();
        if (fcKaydet.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fcKaydet.getSelectedFile();
            try (FileOutputStream fos = new FileOutputStream(selectedFile)) {
                String str = icerik.getText();
                byte[] data = str.getBytes(StandardCharsets.UTF_8);
                fos.write(data);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Hata oluştu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void dosyaAc() {
        JFileChooser fcAc = new JFileChooser();
        if (fcAc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fcAc.getSelectedFile();
            try (FileInputStream fis = new FileInputStream(selectedFile)) {
                byte[] data = fis.readAllBytes();
                String str = new String(data, StandardCharsets.UTF_8);
                icerik.setText(str);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Hata oluştu", JOptionPane.ERROR_MESSAGE);

            }
        }


    }

    private void cikisYap() {
        System.exit(0);
    }
}
