package day48;

public class Kare {
    private int kenar;


    public Kare() {

    }

    public Kare(int kenar) throws LengthException {
        setKenar(kenar);
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) throws LengthException {
        if (kenar < 0) throw new LengthException();
        this.kenar = kenar;
    }


}
