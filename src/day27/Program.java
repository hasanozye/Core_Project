package day27;

public class Program {
    public static void main(String[] args) {
        /*
    OOP -Nesneye Dayalı Programlama
    Amaç: Gerçek hayat nesnelerini soyutlayıp (abstraction), sınıf tasarımları yapmak.
    Yani gerçek hayat nesnelerini özellik ve davranışlarının simüle edilmesi işlemidir.

    Nesneye Dayalı Programlananın Prensipleri
    1. Kalıtım (inheritance)
    2. Sarmalama, paketleme (encapslulation)
    3. Çok biçimlilik (polymorphism)
     */

        Hayvan hayvan = new Hayvan();
//        hayvan.isim = "Hayvan 1";
//        hayvan.agirlik = 12;

//        hayvan.yas = 3;
        hayvan.agirligiKaydet(12);
        hayvan.yasiKaydet(3);
        hayvan.ismiKaydet("Hayvan 1");
        hayvan.beslen();
        hayvan.uyu();

        System.out.printf("%s %d - %.2f\n",hayvan.ismiGetir(),hayvan.yasiGetir(),hayvan.agirligiGetir());
        Aslan aslan = new Aslan();


    }

}
