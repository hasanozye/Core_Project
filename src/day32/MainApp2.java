package day32;

import day32.personelpro.Mudur;
import day32.personelpro.Personel;

public class MainApp2 {
    public static void main(String[] args) {
        Mudur md1 = new Mudur();
        md1.setMaas(10000);
        md1.iseBasla();


//        md1.gorevYap();

//        md1.molaVer();

//        Bir ata sınıf (Personel), Kendisinden türemiş (extend) alt sınıf ( MUdur) Örneklerine )nesnelerine, objects) referans olabilir.
        Personel p = new Mudur();
        p.gorevYap();

    }

}
