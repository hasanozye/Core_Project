package day32.personelpro;

public class Personel {
    private int sicilNo;
    private String adi;
    private String soyadı;
    private double maas;
    private int iseGirisYili;

    public Personel() {
    }

    public Personel(int sicilNo, String adi, String soyadı, double maas, int iseGirisYili) {
        this.sicilNo = sicilNo;
        this.adi = adi;
        this.soyadı = soyadı;
        this.maas = maas;
        this.iseGirisYili = iseGirisYili;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadı() {
        return soyadı;
    }

    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getIseGirisYili() {
        return iseGirisYili;
    }

    public void setIseGirisYili(int iseGirisYili) {
        this.iseGirisYili = iseGirisYili;
    }

    public void iseBasla(){
        System.out.println("Personel işe başladı");
    }

    public void molaVer(){
        System.out.println("Personel mola verdi");
    }

    public void paydosYap(){
        System.out.println("Personel paydos yaptı.");
    }

    public void gorevYap(){
        System.out.println("Personel görevini yapıyor.");
    }

    /*public static void maasaZamYap(Personel personel, int zamOrani){
        if (personel==null || zamOrani <=0)  return;
        double mevcutMaas = personel.getMaas();
        personel.setMaas(mevcutMaas+mevcutMaas*zamOrani/100);

    }*/
    public static boolean maasaZamYap(Personel personel, int zamOrani){
        if (personel==null || zamOrani <=0)  return false;
        personel.setMaas(personel.getMaas()*(100+zamOrani)/100);
        return true;
    }



}
