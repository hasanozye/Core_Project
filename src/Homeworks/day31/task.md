"Daire" adında bir sınıf yazın. Sınıfın, double türünde "yaricap" isimli bir alana (örnek değişken) ihtiyacı vardır.
Sınıfın, double türünde "yaricap" parametreli bir kurucumetoda sahip olması ve yapılandırması gerekir.

"yaricap" parametresinin 0'dan küçük olması durumunda, "yaricap" alan (instance variable) değerini 0 olarak ayarlaması gerekir.

Aşağıdaki metotları yazınız (instance methods):

"getYaricap" metodu, herhangi bir parametre almadan, yaricap değişkeninin değerini döndürmesi gerekir.
"getAlan" metodunun herhangi bir parametre almadan hesaplanan alanı (yaricap * yaricap * PI) döndürmesi gerekir. PI için Math.PI sabitini (constant) kullanabilirsiniz.
"Daire" sınıfını genişleten (extends) "Silindir" adında bir sınıf yazın. Sınıf, double türünde "yukseklik" isminde bir alana (örnek değişken) ihtiyaç duyar.
Sınıfın, her ikisi de double türünde iki parametreye ("yaricap" ve "yukseklik") sahip kurucu metodu (constructor) olması gerekir. Ata sınıfın kurucu metodu çağırılarak "yaricap" alanı yapılandırılmalıdır. Ayrıca "yukseklik" alanının yapılandırılması gerekiyor.

"yukseklik" parametresinin 0'dan küçük olması durumunda "yukseklik" alanı değerinin 0 olarak ayarlaması gerekir.

Aşağıdaki metotları yazınız (instance methods):

"getYukseklik" metodu, herhangi bir parametre almadan, "yukseklik" alanının değerini döndürmesi gerekiyor.
"getHacim" metodu, herhangi bir parametre almadan, hesaplanan hacmi döndürmesi gerekir. Hacmi hesaplamak için ata sınıf alanını yükseklikle çarpınız.
"getAlan" metodunu override (ezmek, geçersiz kılmak, yeniden yazmak) yapınız. Silindirin alanı (2 * yaricap * yaricap * PI + 2 * PI * yaricap * yukseklik) formülü ile hesaplanmaktadır.
→ TEST KODU:

System.out.println("Daire..."); Daire daire = new Daire(3.75); System.out.println("Yarıçap= " +daire.getYaricap()); System.out.println("Alan= " +daire.getAlan()); System.out.println(""); System.out.println("Silindir..."); Silindir silindir = new Silindir(5.55, 7.25); System.out.println("Yarıçap= " + silindir.getYaricap()); System.out.println("Yükseklik= " + silindir.getYukseklik()); System.out.println("Alan= " + silindir.getAlan()); System.out.println("Hacim= " + silindir.getHacim());

→ ÇIKTI Daire... Yarıçap= 3,75 Alan= 44,18
Silindir... Yarıçap= 5,55 Yükseklik= 7,25 Alan= 446,36 Hacim= 701,57
NOT: Tüm metotlar public olmalı ama static olmamalıdır.

NOT: Toplamda 2 adet sınıf yazmanız gerekmektedir.