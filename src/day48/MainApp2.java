package day48;

public class MainApp2 {
    public static void main(String[] args) {
        try {
            Hesap hesapAhmet = new Hesap("001", "Ahmet", "Dursun", 100);
            System.out.println("Bakiye = "+hesapAhmet.paraYatir(50));
            System.out.println("Bakiye = "+hesapAhmet.paraCek(80));
            System.out.println("Bakiye = "+hesapAhmet.paraCek(100));
        } catch (MiktarHatası e) {
            System.err.println(e.getMessage());
        }catch (YetersizBakiyeHatası e){
            System.err.println(e.getMessage());
        }
    }
}
