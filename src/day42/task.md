Bir halı/kilim mağazası, dikdörtgen odalar için halı/kilim fiyatını hesaplayan bir uygulama yazmanızı istedi. Toplam maliyeti hesaplamak için zeminin alanını (genişlik x uzunluk) halının metrekare fiyatı ile çarparsınız. Örneğin 12 metre uzunluğunda ve 10 metre genişliğinde olan zeminin alanı 120 metrekaredir. Zemini metrekaresi 80 lira olan bir halıyla kaplamak 9600 liraya mal olacaktır.

"Zemin" adında bir sınıf yazın. Sınıf, String tipinde aciklama, double türünde "genislik" ve "uzunluk" olan üç alana (örnek değişkenler) ihtiyaç duyar.
Sınıfın, String türünde aciklama, double türünde "genislik" ve "uzunluk" parametrelerine sahip bir kurucu metoda sahip olması ve değişkenleri yapılandırması gerekir.

Parametrelerin değerlerinin 0'dan küçük olması durumunda "genislik" ve "uzunluk" alanlarının değerlerinin 0'a ayarlaması gerekir.

Aşağıdaki metotları yazınız (instance methods):

"alanHesapla" adlı metot, herhangi bir parametre almadan, hesaplanan alanı (genislik * uzunluk) döndürmesi gerekir.
"toString" adlı metodu override ediniz. Metot, aciklama, genislik ve uzunluk değerlerini döndürmelidir. Örnek dönüş değeri; Mutfak (4 x 3)
"Hali" adında bir sınıf yazın. Sınıf, double türünde "fiyat" isimli bir alana (örnek değişken) ihtiyaç duyar.
Sınıfın, double türünde "fiyat" isimli parametresi olan bir kurucu metoda sahip olması ve değişkeni yapılandırması gerekir.

Parametre değerinin 0'dan küçük olması durumunda "fiyat" alanı değerinin 0 olarak ayarlanması gerekir.

Aşağıdaki metotları yazınız (instance method):

"getFiyat" isimli metot herhangi bir parametre almadan, fiyat alanının değerini döndürmesi gerekiyor.
"toString" isimli metot override edilmelidir. Örnek dönüş değeri; Birim fiyatı: 25.50
"Hesap" adında bir sınıf yazın. Sınıfın, Zemin tipinde "zemin" ve Hali tipinde "hali" adında iki alana (örnek değişkenler) ihtiyacı vardır.
Sınıfın Zemin tipinde "zemin" ve Hali tipinde "hali" parametrelerine sahip bir kurucu metoda sahip olması ve yapılandırması gerekir.

Aşağıdaki metotları yazınız (instance method):

"getToplamMaliyet" isimli metod, herhangi bir parametre almadan, zemini bir halı ile kaplamak için hesaplanan toplam maliyeti döndürmesi gerekir.
"toString" metodu override edilmelidir. Örnek dönüş değeri; Toplam maliyet: 150.75
TEST ÖRNEĞİ

→ TEST KODU:

Hali hali = new Hali(3.5); Zemin zemin = new Zemin(2.75, 4.0); Hesap hesap = new Hesap(zemin, hali); System.out.println("Toplam maliyet: " + hesap.getToplamMaliyet()); veya System.out.println(hesap); hali = new Hali(1.5); zemin = new Zemin(5.4, 4.5); hesap = new Hesap(zemin, hali); System.out.println("Toplam maliyet: " + hesap.getToplamMaliyet()); veya System.out.println(hesap);

→ ÇIKTI

Toplam maliyet: 38,5 Toplam maliyet: 36,45

NOT: Tüm metotlar public olmalı ama static olmamalıdır.

NOT: Toplamda 3 sınıf yazmanız gerekmektedir.

NOT: MainApp sınıfı ve main metodu zaten mevcuttur.