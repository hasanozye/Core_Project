package day55.Kafeterya;

import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {

        Stok stok1 = new Stok();
        stok1.addAll(Urun.stokHazirla());
        stok1.listele();
        System.out.println();
        stok1.isimSiraliListele();
        stok1.fiyataGoreListele();
        stok1.fiyataGoreTersSiraListele();
        stok1.fiyataGoreTerseveMiktaraGoreTersSiraliSlistele();
        List<Urun> head3 = stok1.head(3);
        List<Urun> head = stok1.head();
        System.out.println("head3 = " + head3);
        System.out.println("head = " + head);




        List<Urun> tail2 = stok1.tail(-2);
        System.out.println("tail2 = " + tail2);





    }
}
