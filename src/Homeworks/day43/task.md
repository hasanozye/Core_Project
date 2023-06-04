Task: Bir mobilya mağazası için proje geliştirilecektir. Bunun için gerekli olan tanımlamalar aşağıda verilmiştir. Lütfen uygun sınıf (class) ve arayüzleri (interface) tasarlayınız.

Mobilya (class):
Gerekli alanlar: aciklama : String tipinde (örn; Ahşap Sehpa, Plastik Masa, Metal Dolap vb.) yukseklik : double tipinde (40.0 cm, 75.3 cm vb.) kapaliMi : boolean tipinde ( false: ayaklı masa (sadece üstteki yüzey alanı hesaplanacak), true: dolap (tüm yüzey alanları hesaplanacak) )
Parametreli ve parametresiz iki kurucu metot (constructor) geliştirilecektir.
yukseklik alanına setter metodu içerisinde koruma sağlanacaktır. (Ancak sıfırdan büyük değer alabilir)
yukseklik alanı setter metodu parametreli kurucu metot içerisinde de kullanılarak koruma sağlanacaktır.
toString metodu override edilecktir. (Geriye sadece aciklama alanını döndürecektir)
Dortgen (interface):
Gerekli metotlar: void setGenislik(double genislik); double getGenislik(); void setDerinlik(double derinlik); double getDerinlik(); double alanHesapla(); : Eğer kapaliMi false ise (genislik x derinlik) değilse (6 x genislik x derinlik) double hacimHesapla(); : genislik x derinlik x yukseklik
Daire (interface):
Gerekli metotlar: void setYaricap(double yaricap); double getYaricap(); double alanHesapla();: Eğer kapaliMi false ise (PI x yaricap x yaricap) değilse (2 x PI x yaricap x yaricap + 2 x PI x yaricap x yukseklik) double hacimHesapla(); PI x yaricap x yaricap x yukseklik
Masa (class):
Mobilya'dan extend edilecek
Dortgen arayüzünü implemente edecek
Parametresiz kurucu metot yazılacak
Parametreli kurucu metot aciklama, genislik, derinlik, yukseklik ve kapaliMi parametrelerini alarak yazılacak
toString metodu override edilecek (ata sınıfın (super) toString metodu + [genislik x derinlik x yukseklik]: örn; Ahşap Masa [120 x 60 x 70])
Sehpa (class):
Mobilya'dan extend edilecek
Dortgen arayüzünü implemente edecek
Parametresiz kurucu metot yazılacak
Parametreli kurucu metot aciklama, genislik, derinlik, yukseklik ve kapaliMi parametrelerini alarak yazılacak
toString metodu override edilecek (ata sınıfın (super) toString metodu + [genislik x derinlik x yukseklik]: örn; Küçük Sehpa 30 x 30 x 40])
YuvarlakMasa (class):
Mobilya'dan extend edilecek
Daire arayüzünü implemente edecek
Parametresiz kurucu metot yazılacak
Parametreli kurucu metot aciklama, yaricap, yukseklik ve kapaliMi parametrelerini alarak yazılacak
toString metodu override edilecek (ata sınıfın (super) toString metodu + [yaricap x yukseklik]: örn; Ahşap Yuvarlak Masa [80 x 70])
YuvarlakSehpa (class):
Mobilya'dan extend edilecek
Daire arayüzünü implemente edecek
Parametresiz kurucu metot yazılacak
Parametreli kurucu metot aciklama, yaricap, yukseklik ve kapaliMi parametrelerini alarak yazılacak
toString metodu override edilecek (ata sınıfın (super) toString metodu + [yaricap x yukseklik]: örn; Ahşap Yuvarlak Sehpa [40 x 40])
MainApp (class):
Zaten verilmiştir.
main metodu verilmiştir.
MainApp - main metodu içerisinde yapılacaklar:
Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
sout(mobilya1);
sout(mobilya1'in alanını gösteriniz);//unboxing
sout(mobilya1'in hacmini gösteriniz);//unboxing
Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
sout(daire1);
sout(daire1'in alanını gösteriniz);//unboxin gerekli mi?
sout(daire1'in hacmini gösteriniz);//unboxing gerekli mi?
Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};//Doğru çalışıyor mu? Neden?