package day32;

import day32.personelpro.Personel;

public class MainApp {
    public static void main(String[] args) {
        Personel per1 = new Personel();
        per1.setAdi("Ahmet");
        per1.setSoyadı("Dursun");
        per1.setSicilNo(1);
        per1.setIseGirisYili(1990);
        per1.setMaas(5000);

        per1.iseBasla();
        System.out.println("-------------------");
        per1.molaVer();
        System.out.println("-------------------");
        per1.paydosYap();

        if (Personel.maasaZamYap(per1,10)){
            System.out.println("Zam yapıldı.");
        }else {
            System.out.println("Zam yapılamadı");
        }

        System.out.println("Maaş :"+per1.getMaas());

        per1=null;

        if (!Personel.maasaZamYap(per1,10)){
            System.out.println("Başarısız.");
        }

    }
}
