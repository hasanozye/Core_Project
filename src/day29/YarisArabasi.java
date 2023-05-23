package day29;

public class YarisArabasi extends Araba{
    public void turbo(){
        System.out.println("Yarış arabası turbo ile uçuyor.");
    }

    @Override
    public void ilerle() {
        System.out.println("Yarış arabası hızla ilerliyor.");
    }


}
