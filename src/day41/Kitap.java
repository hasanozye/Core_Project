package day41;

public class Kitap implements Comparable<Kitap>,Cloneable {
    private String adi;
    private String yazari;
    private Integer sayfa;

    public Kitap() {
    }

    public Kitap(String adi, String yazari, int sayfa) {
        this.adi = adi;
        this.yazari = yazari;
        this.sayfa = sayfa;
    }

    @Override
    public Kitap clone() {

        Kitap k = new Kitap(adi,yazari,sayfa);


        return k;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

    public int getSayfa() {
        return sayfa;
    }

    public void setSayfa(int sayfa) {
        this.sayfa = sayfa;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", sayfa=" + sayfa +
                '}';
    }

    @Override
    public int compareTo(Kitap o) {
        return this.sayfa.compareTo(o.sayfa);
    }


    /*@Override
    public int compareTo(Kitap o) {
        return this.adi.compareTo(o.adi);
    }*/

    /*@Override
    public int compareTo(Kitap o) {
        int result = 0;
        if (this.sayfa > o.sayfa) {
            result = 1;
        } else if (this.sayfa < o.sayfa) {
            result = -1;

        }


        return result;
    }*/
}
