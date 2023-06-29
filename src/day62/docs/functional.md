# Functional Programming

1. Fonksiyonel programlama, yalnızca fonksiyonların kullanılmasıyla yazılmış programlardır.
2. Bir uygulamanın durumunu (state) ve verilerini **doğrudan değiştirmeden**, matematiksel fonksiyonlar yardımıyla sonuç üretilmesini sağlayan bir programlama yaklaşımıdır.

FP’de değişkene değer atama işlemi genellikle yapılmaz. Yapılacaksa değişkenin değeri kopyalanır ve yeni bir değişken yaratılır. Bunun sebebi Tanım 2 de belirttiği gibi uygulamanın durumunu değiştirmemek ve çok kanallı (multi-thread) yani bir programda aynı anda birden çok fazla işin yapılması durumunda, aynı kaynağa erişmekten dolayı kilitlenmelerin oluşması engellemektir.

FP’de; çıktı değeri, fonksiyona girdi olarak verilen parametre değerlerine bağlıdır. Yani fonksiyon aynı parametreler ile defalarca çağrılsa ,işlemin sonunda aynı sonuç üretilir.

## Lambda Calculus
Church Turing tezi ile literatüre kazandırılmıştır. Doğal sayılar üzerinde tanımlı olan bir fonksiyon, kaynak sınırı göz ardı edilirse, bir insan tarafından hesaplanabilir ve aynı zamanda Turing makinesi(Yazdığımız bütün programlar) tarafından hesaplanan fonksiyonlar üzerine kurulu tezdir.

Diğer bir deyişle; sadece parametreleri ve işleyişi ile tanımlanan isimsiz fonksiyonlara Lambda ifadeleri denir. Bu ifadeler ile yapılan hesaplama modeline Lambda Calculus denir. Aşağıdaki resimde verilen sayının küübünü hesaplayan lamda fonksiyonu gösterilmiştir.

lambda(x):x*x*x olarak tanımlanmışsa lambda(2) fonksiyon kullanımı 8 değerini üretir.

## OOP vs FP
Ama nesne yönelimli programlama dilleri yeni versiyonlarına FP’yi dahil etmektedir. Hatta bir çok uygulamada bu iki programlama paradigması karışık olarak kullanılmaktadır. Nesne yönelimli programlama da bu fonksiyonlara metot ismi verilmektedir.
```
+----------------------------------------------------------+---------------------------------------------------------------+
|                           FP                             |                           OOP                                 |
+----------------------------------------------------------+---------------------------------------------------------------+
| Değiştirilmez Veriler (Immutable data)                   | Değiştirilebilir Veriler Kullanılır (Mutable data.)           |
| Bildirimsel (Declarative) Programala Modeli              | Emirsel(Imperative) Programlama Modeli                        |
| “Ne Yapıyorsun” durumuna odaklanmıştır                   | “Nasıl Yapıyorsun” durumuna doklanmıştır                      |
| Paralel programlama için uygundur                        | Paralel programalama için uygun değildir                      |
| Fonksiyonlar yan etkiden arındırılmıştır                 | Fonksiyonlar yan etkilere mağruzdur                           |
| Özyenileme kavramını kullarak yineleme işlemlerini yapar | Yineleme işlemlerinde Döngüler (for loop, foreach) kullanılır |
+----------------------------------------------------------+---------------------------------------------------------------+
```

![](img.png)

**Birinci Sınıf Fonksiyon(First Class Function):** Programlama dillerinde, bir değişkene atanma, metoda parametre olarak geçirilme ya da onda değer olarak döndürülme işlemlerine tabi tutulan yapılara birinci sınıf vatandaş denir. Fonksiyonların birinci sınıf vatandaş gibi davranması durumudur. Yazılım dilinde bu fonksiyonların uygulandığı fonksiyonlara Yüksek Merteden fonksiyonlar(Higher Order Funcitons) denir.

**Saf Fonksiyon(Pure Function):** Sadece girdi değerini alıp, global bir değişkene etki etmeden çıktı değer üreten fonksiyonlardır. Bu duruma ise Başvuruşsal şeffaflık (Referential transparency) denir.

**Yan Etkilerden Arındırılma(No Side Effects):** Bir fonksiyonun dışardan gelen durumlara göre farklı çıktı üretmesi durumuna Yan etki denir. Fonksiyonel progralamada fonksiyonlar yan etkilerden arındırılmış olmalıdır.

**Değiştirilmez Veri (Immutable Data):** Verilen değerinin değişmemesi durumudur

**Durumsuzlık(Statelessness):** Fonksiyon uygulamaya ait herhangi bir durum bilgisini tutmaz ve değiştirmez

**Lazy Evaluation:** Bir değişkenin değerinin, mecbur kalınana kadar hesaplanmaması durumudur. Değişkenin değerine ihtiyaç olduğu ana kadar hesaplama yapılmaz

```
Lazy Evaluation:
int a = 5;
int b = 2;
int c = a/b; // c, hafızada a/b ifadesi olarak işaretlenir.
int d = c*b; // d, hafızada c*b olarak işaretlenir.
```


## Java’da Fonksiyonel Programlama
Bir yazılım dilinin fonksiyonel programlama özelliğine sahip olabilmesi için aşağıdaki 3 temel konsepti sağlaması gerekmektedir. Java’nın bu konseptleri nasıl sağladığına yakından bakalım.

```
Fonksiyonlar birinci sınıf vatandaşlardır
Saf Fonksiyonlar
Yüksek mertebe fonksiyonlar
```

## Birinci Sınıf Fonksiyonlar
Programlama dillerinde, bir değişkene atanma, metoda parametre olarak geçirilme ya da metottan değer olarak döndürülme işlemlerine tabi tutulan nesnelere birinci sınıf vatandaş denir. FP ise fonksiyonların birinci sınıf nesne gibi davrandığı programlama yaklaşımıdır. Bu yaklaşımda fonksiyonların parametre olarak bir fonksiyona geçirilebilir, bir fonksiyonun örneği (instance) yaratılabilir, bir fonksiyon örneği, referans değişkende tutulabilir.

Java’da fonksiyonlar(metotlar) birinci sınıf nesneler değildir. Java 8 ile Lambda İfadeleri kullanılarak Birinci Sınıf Fonksiyonlar kavramı getirilmiştir.

## Saf Fonksiyonlar
Çalıştırılma anında herhangi bir yan etkiye mâruz kalmayan ve parametre olarak verilen değerlere göre çıktı üreten fonksiyonlara denir.

Saf fonksiyonların tanımlanmasında dikkat edilecek kurallar:
1. Durumsuzluk(No State),
2. Yan etkilerden arındırılma (side-effect)
3. Değişmez/Sabit/Durağan değişkenler (final)

```
public class SafFonksiyonOrnek{
public int topla(int a, int b) {
return a + b;
}
}
```

*topla* fonksiyonu 2 tane parametre almakta ve verilen parametreleri toplayıp sonucu dönmektedir. Uygulama içerisinde bulunan ve fonksiyonun dışındaki herhangi bir değişkenin durumunu değiştirmediği için herhangi bir yan etkisi bulunmamaktadır. Aşağıdaki örnekte Saf Olmayan fonksiyon tanımı yapılmmıştır.

```
public class SafOlmayanFonksiyon{
private int deger = 0;

    public int topla(int birSonrakiDeger) {
        this.deger += birSonrakiDeger;
        return this.deger;
    }
}
```

**Durumsuzluk:** FP’nin önemli kurallarından biridir. Bir fonksiyon, geçici olarak durumu tutan local değişkenlere sahip olabilir. Ama bu fonksiyon kesinlikle sınıf veya ait olduğu fonksiyonda tanımlı olan değişkenlere ve nesnelere referans etmemeli.

**Yan etkilerden arındırılma:** Bir fonksiyon kesinlikle dışarıdaki bir durumu değiştirmemeli.

**Değişmez/Sabit/Durağan değişkenler:** Değiştirilemez değişkenler FP’nin üçüncü önemli kuralıdır. Bu değişkenler yan etkilerden kurtulmak için önemlidir. Java 8 ile gelen map ve filter API’leri bir diziye uygulandığı dizinin orijinal yapısında herhangi bir işlem yapmayıp dizinin bir kopyası ile gerekli işlemleri yapmaktadır.

## Yüksek Mertebe Fonksiyonlar (Higher Order Functions)
Parametre olarak bir veya birden çok fonksiyon alan ve sonuç olarak başka bir fonksiyon dönen fonksiyonlara denir. Java’da yüksek mertebe fonksiyonlar; Lambda ifadelerinin parametre olarak geçirilmesi ve başka bir lambda ifadesinin dönmesi ile sağlanmaktadır.

```
public class YuksekMertebeFonksiyonSınıfır {
    public <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
        return () -> {
           T instance = producer.produce();
           configurator.configure(instance);
           return instance;
        }
    }
}
```

Yukarıdaki örnekte createFactory metodu, parametre olarak iki tane fonksiyonel arayüz örneğini almakta ve lambda ifadesini sonuç olarak dönmektedir. createFactory metodu yüksek mertebe fonksiyonudur.

Java lambda ifadeleri Fonksiyonel Arayüzden(Functional Interface) uygulanmış(implement) edilmelidir.

Java 8 ile yukarıda belirtilen tüm konsept Java’ya dahil edilmiş ve Java’nın fonksiyonel programlamayı destekleyen bir dil olması sağlanmıştır.

## Lambda İfadeleri
Lambda ifadeleri kendi başlarına tanımlanabilen fonksiyonlara denir. Söz dizilimi basitçe şu şekildedir.

```
(parametre) -> {fonksiyon gövdesi}

public class LambdaIfadelerSinifi{
 
     (x, y) -> {return x + y}   // İki parametreli lambda fonksiyonu
      x -> x * x                        // Tek parametreli lambda fonksiyonu
     () -> x                            // Parametresi lambda fonksiyonu 
     (double x) -> x*x                  // Parametrelerin tipi belirtilmiş
}

```

Lambda komutlarında tipsiz veya parametresiz fonksiyon tanımlamak mümkündür. Eğer tek parametreli bir fonksiyon tanımlanacaksa parantezlere ihtiyaç yoktur. Parametresiz bir fonksiyon tanımlanacaksa *()* şeklinde tanımlama yapılır. Fonksiyon gövdesinde eğer tek satırlık bir işlem yapılıyorsa *{}* parantezlerine ve *return* ifadesine gerek yoktur. Eğer istenilirse parametrelerin tipi belirtilebilir.

**Lambda ifadelerin kullanım şekilleri:**

1. Lambda ifadeleri nesne olarak kullanılabilir. Lambda ifadelerini bir değişkene atayıp, herhangi bir nesneye geçirilebilir.

```
// Fonksiyonel Arayüz
public interface BuyuklukKontrolu {
public boolean buyuktur(int a, int b);
}

BuyuklukKontrolu kontrol = (a, b) -> a1 > a2;
boolean result = kontrol.buyuktur (2, 5);
```

2. Lambda ifadeleri *::* kullanılarak metot referansı olarak kullanılabilir.
```
// fonksiyonel Arayüz
public interface LogYaz{
public void yaz(String s);
}
// birinci kullanım şekli
LogYaz logaYaz = s -> System.out.println(s);

//Lambda ifadelerin metot referansı şeklinde kullanımı:
LogYaz logaYaz = System.out::println;
logaYaz.yaz(“Merhaba Dünya”)
```

3. Static metotlar da lambda ifadelerinde kullanılabilir
```
class CarpmaISlemi{  
   public static int carp(int a, int b){  
	return a*b;  
   }  
}  
 
public class StaticmetotOrnek {  
   public static void main(String[] args) {  
	BiFunction<Integer, Integer, Integer> fn = CarpmaISlemi::carp;  
	int sonuc = fn.apply(11, 5);  
	System.out.println("Sonuc: " + sonuc);  
   }  
}
```

4. Parametreli metotlar da lambda ifadeleri ile kullanılabilir.
```
public interface Ara {
    public int bul(String s1, String s2);
}
 // Ara ara = (s1, s2) -> s1.indexOf(s2);  // normal lambda ifadesi
Ara ara = String::indexOf;  // parametreli metot referans ifadesi
ara.bul(“Selam”,”S”);
```

```
public interface Ara {
    public int bul(String s1, String s2);
}
 // Ara ara = (s1, s2) -> s1.indexOf(s2);  // normal lambda ifadesi
Ara ara = String::indexOf;  // parametreli metot referans ifadesi
ara.bul(“Selam”,”S”);
```

5. Overload edilmiş Static metotlar da lambda metot referans ile kullanılabilir.

```
class Arithmetic {
public static int topla(int a, int b) { return a + b; }
public static float topla (int a, float b) { return a + b; }
public static float topla (float a, float b) {  return a + b;  }
}

public class OverrideEdilmisFonklar{
public static void main(String[] args) {
BiFunction<Integer, Integer, Integer> toplam1 = Arithmetic::topla;
BiFunction<Integer, Float, Float> toplam2 = Arithmetic::topla;


        int sonuc1 = toplam1.apply(10, 20);
        float sonuc1 = toplam2.apply(10, 20.0f);
    }
}
```

6. Lambda fonksiyonları constructor metot referansı olarak kullanılabilir

```
class ToplamaIslemi {
ToplamaIslemi(){
// kodlar burada
}
}

public class OverrideEdilmisFonklar{
public static void main(String[] args) {
        ToplamaIslemi islem=  ToplamaIslemi::new;

        // örnek 2
        Function<String, Integer> f = Integer::new;
        Integer i = f.apply(100);
    }
}
```

## Fonksiyonel Arayüz(Functional Interface)
İçerisinde sadece bir tane soyut metot (implement edilmemiş) bulunan arayüzlerdir. Java’da fonksiyonların birinci sınıf fonksiyonlar olarak kullanılması için ve lambda ifadesi ile tanımlanan fonksiyonların başka bir fonksiyona parametre olarak geçirilmesi veya fonksiyonların bir değişkene tanımlanabilmesi için getirilen bir özelliktir.

Zorunlu olmamakla birlikte *@FunctionalInterface* anotasyonu ile tanımlanır. Bu anotasyon interface tanımına eklenirse ve yanlışlıkla arayüzün içine birden fazla soyut metot tanımlanması durumunda compile error verecektir

```
@FunctionalInterface
public interface Runnable {
public abstract void run();
}

// Kullanımı
public class FonksiyonelArayüzTest {
public static void main(String[] args) {
// 1.8’den önce
Runnable runnable1 = new Runnable() {
@Override
public void run() {
System.out.println("Before 1.8");
}
};
runnable1.run();

        // 1.8 ile birlikte
        Runnable runnable2 = () -> System.out.println("1.8");
        runnable2.run();
    }
}
```

Normalde arayüzlerde metotların içeriği olmaz, sadece açıklanır. Ama *default* ve *static* anahtar kelimeleri ile metot gövdeleri yazılabilir. Bu Arayüzün Fonksiyonel Arayüz sayılabilmesi için bir tane implement edilmemiş soyut metot bulunması yeterlidir.

```
public interface FIOrnek{
public void calistir();
public default void yaz(String metin) {
System.out.println(text);
}
public static void yaz(String text, PrintWriter yazıcı) throws IOException {
writer.write(text);
}
}
```

## Gömülü(Built-in) Arayüzler

Geliştirme esnasında karşılaşılan bir sorunların çözümleri Java 8 gömülü olarak fonksiyonel fonksiyonlarla geldi. Bu fonksiyonlar birçok durumda kullanılabileceği için, çoğu zaman yeni bir Fonksiyonel Arayüz yazmaya gerek duyulmamaktadır. Aşağıda en yaygın olarak kullanılan arayüzler örneklerle açıklanmıştır.

**Supplier<T>:** Herhangi bir parametre almayan belirtilen tip nesne veya sonuç döner. “get()” soyut sınıfı ile istenilen sonuç alınır.

```
@FunctionalInterface
public interface Supplier<T> {
T get();
}
```

```
import java.util.function.Supplier;

public class Main {
public static void main(String args[])
{
Supplier<Double> rastgeleSayi = () -> Math.random();
System.out.println(rastgeleSayi.get());
System.out.println(rastgeleSayi.get());
}
}
```

```
import java.util.function.Supplier;

public class Main {
public static void main(String[] args) {
Supplier<Student> ogrenci = Main::ogrenciYarat;

    for (int i = 0; i < 10; i++) {
      System.out.println("#" + i + ": " + ogrenci.get());
    }
}

public static Ogrenci ogrenciYarat() {
return new Ogrenci("A",2);
}

}

class Ogrenci {
public String adiSoyadi;
public double numarasi;

Student(String adiSoyadi, double numarasi) {
this.adiSoyadi = adiSoyadi;
this.numarasi = numarasi;
}

@Override
public String toString() {
return adiSoyadi + ": " + gpa;
}
}
```

**Predicate<T> :** Verilen parametreye ve tanımlanan koşul fonksiyonuna göre true yada false değerini dönen Fonksiyonel Arayüzdür.

```
@FunctionalInterface
public interface Predicate<T> {
boolean test(T t);
}
```

```
import java.util.function.Predicate;
public class Main {
 
  public static void main(String[] args) {
    Predicate<String> i  = (s)-> s.length() > 5;
   
    System.out.println(i.test("https://medium.com/@thrkardak"));
  }
}
```

**BiPredicate<T,T>:** Predicate ile benzer işlemi yapar. BiPredicate ile verilen 2 parametreye göre koşul işlemleri oluşturabilir.

```
@FunctionalInterface
public interface BiPredicate<T, U> {
   boolean test(T t, U u);
}
```

```
public class Main {
  public static void main(String[] args) {
    BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
    System.out.println(bi.test(2, 3));
  }
}
```

**Consumer<T>:** Kendisine verilen parametreyle işlem yapan ve geriye birşey dönmez


```
@FunctionalInterface
public interface Consumer<T> {
   void accept(T t);
}
```

```
public class Main {
 
	    static class Point {
	        Double x, y;
	        public Point(Double x, Double y) {
	            this.x = x;
	            this.y = y;
	        }
	    }
	    
	    public static void main(String... args) {
	        Point point = new Point(1.0, 2.0);
	        Consumer<Point> pointYaz = (p) -> System.out.printf("x = %f, y = %f\n", p.x, p.y);
	        Consumer<Point> pointYaz2 = (p) -> System.out.printf("(%f, %f)\n", p.x, p.y);
	        pointYaz.accept(point);
	        pointYaz2.accept(point);
	    }
	}
```

**Function<T,R>:** Kendisine verilen parametre ile belirtilen işlemi yapan ve işlemin sonunda belirtilen tipde değer döner.

```
@FunctionalInterface
public interface Function<T, R> {
   R apply(T t);
}
```

```
public class Main {
	    static Function<String, String> kisaKod = (s) -> {
	        if (null == s || s.length() == 0) return "yok";
	        String[] splits = s.split(" ");
	        String ret = splits[0];
	        if (splits.length >= 2) ret += " " + splits[1].substring(0, 1) + ".";
	        return ret;
	    };
 
	    public static void main(String... args) {
	        System.out.println(kisaKod.apply("Falih Rıfkı Atay"));
	        System.out.println(kisaKod.apply("Adam Smith"));
	    }
}
```

## Yüksek Mertebeden Fonksiyonlar(YMF)
Parametre olarak fonksiyon alabilen sonuc olarak fonksiyon dönebilen fonksiyonlara denir.

```
public class Main {
List<String> list = Arrays.asList("Bir","Abc","BCD");

	Collections.sort(list, (String a, String b) -> {
    	return a.compareTo(b);
	});
	System.out.println(list);
}
```

Yukarıdaki örnekte dizide sıralama işlemi yapılıyor. Örnekte Array.sort yüksek mertebe fonksiyonu iki parametre almaktadır. ilk parametre işlem yapılacak liste ikinci parametre ise sıralama fonksiyonu. Parametre olarak bir fonksiyon aldığında bu fonksiyon YMF’dur.

```
public class Main {
	List<String> list = Arrays.asList("One","Abc","BCD");
	Comparator<String> comparator = (String a, String b) -> {
   	 return a.compareTo(b);
	};
 
	Comparator<String> tersSirala = comparator.reversed();
	Collections.sort(list, tersSirala);
	System.out.println(list);
 
}
```

Yukarıdaki örnekte parametre olarak verilen listeye tersten sıralama işlemi yapılıyor. Örnek Liste oluşturulduktan sonra sıralama lambda fonksiyonu Comparator fonksiyonel arayüzüne implement ediliyor. Comprator arayüzünde bulunan reversed() metodu çağrılıyor. reversed() metodu ters sıralama işlemi yapacak olan yeni bir Comprator tipinde lambda fonksiyonu dönüyor(fonksiyon döndüğü için comprator bir YMF’dur) . yani **-1 * comparator.compare(a,b)** fonksiyonu dönüyor.

## Currying
Birden fazla parametreleri tek parametreli fonksiyon şekline dönüştürme işlemidir. Bu işlem ile Yüksek mertebe fonksiyonlar üzerinden yürütülür. Parametreler, teker teker başka fonksiyonlar döndüren fonksiyonlara paslama şeklinde iletilir. Söz dizimi şu şekildedir:

>f(a,b,c); seklinde olan fonksiyon cagrisini f(a)(b)(c); yapmaktır

```
public class Main {
Function<Integer, 
                 Function<Integer,  Function<Integer, Integer> > >  ucluToplam = u -> w -> v -> u + w + v; 
                 System.out.println("Add 2, 3, 4 :" + ucluToplam.apply(2)  .apply(3) .apply(4)); 
    } 
} 
```

## Fonksiyonel Kompozisyon( Functional Composition)
Küçük parçalı fonksiyonları birleştirerek yeni bir fonksiyon oluşturma tekniğidir. Kendi fonksiyonlarınızı yaratabileceğiniz gibi Java 8 de bu işlemi yapabilmeniz için fonksiyonlar gömülü olarak gelmiştir. Bu fonksiyonlar genellikle lambda ifadeleri ile kullanılır.

```
public class Main {
Function<Integer, 
                  Predicate<String> aIleBasliyorMu = (text) -> text.startsWith("A");
	Predicate<String> kIleBitiyorMu   = (text) -> text.endsWith("x");
 
	Predicate<String> aIleBaslaipKIleBitiyorMu =
        (text) -> aIleBasliyorMu.test(text) && kIleBitiyorMu.test(text);
 
	String  metin  = "Ankaragücüme gidiyor böyle yaşamak";
	boolean sonuc = aIleBaslaipKIleBitiyorMu.test(input);
	System.out.println(sonuc);
    } 
} 
```

Yukarıdaki örnekte kullanıcı tarafından tanımlı fonksiyonel kompozisyon oluşturuluyor. Örnekte ilk önce verilen metnin A harfi ile başlayıp başlamadığını kontrol eden lambda ifadesi Predicate fonksiyonel arayüzüne implement ediliyor. Daha sonra verilen metnin son karakterinin K ile bitip bitmediğini kontrol eden Predicate fonksiyonel arayüzüne implement ediliyor. Daha sonra bu iki fonksiyonlar üçüncü bir fonksiyonda birleştiriliyor. ve en sonra olarak fonksiyon çalıştırılıyor. iki kontrolde true dönerse sonuç true olarak dönüyor.

Fonksiyonel Kompozisyon işlemleri Fonksiyonel arayüzler kullanılarak gerçekleştirilir.

>Predicate Fonksiyonel arayüzünde kompozisyon işlemi aşağıdaki fonksiyonlar kullanılarak yapılır:
>* and()
>* or()

```
public class Main {
Function<Integer, 
  Predicate<String> aIleBasliyorMu = (text) -> text.startsWith("A");
	Predicate<String> kIleBitiyorMu   = (text) -> text.endsWith("x");
  
	Predicate<String> aIleBaslayipVeKIleBitiyorMu =  (text) -> aIleBasliyorMu.test(text).and(kIleBitiyorMu.test(text));  
  Predicate<String> aIleBaslayipVeyaKIleBitiyorMu =  (text) -> aIleBasliyorMu.test(text).or(kIleBitiyorMu.test(text));
  
	String  metin  = "Ankaragücüme gidiyor böyle yaşamak";
  
	boolean sonuc = aIleBaslayipVeKIleBitiyorMu.test(input);
	System.out.println(sonuc);  // true
  
	boolean sonuc = aIleBaslayipVeyaKIleBitiyorMu.test(input);
	System.out.println(sonuc);  // false
    } 
} 
```


>Function Fonksiyonel arayüzünde kompozisyon işlemi aşağıdaki fonksiyonlar kullanılarak yapılır:
>* compose()
>* andThen()

```
public class Main {
    Function<Integer, Integer> carp = (value) -> value * 2;
    Function<Integer, Integer> topla      = (value) -> value + 3;

    Function<Integer, Integer> onceToplaSonraCarp = multiply.compose(add);

    Integer sonuc = onceToplaSonraCarp.apply(3);
    System.out.println(sonuc);  // 12

    Function<Integer, Integer> onceCarpSonraTopla = multiply.andThen(add);

    Integer sonuc2 = onceCarpSonraTopla.apply(3);
    System.out.println(sonuc2); //9

} 
```

## Java Akış(Stream)

![img_1.png](img_1.png)

**Java Stream,** öğelerinin iç yinelemesini(iteration) yapabilen bir bileşendir. Bunun anlamı, öğeler kendisini yineleyebilir. Stream kelimesinin Türkçesi “akış, nehir, akarsu”dur. Aslında bu şekilde düşündüğümüzde yapısını kolayca anlayabiliriz. Bir nehir var ve devamlı akmakta, akıp gittiği için stream içindeki elemanlar sadece bir kere ziyaret edilir. Aynı elemanı tekrar işleme dahil edebilmek için yeni bir stream/nehir oluşturmamız gerekmektedir. Bu akış genel itibariyle kullanmış olduğumuz işlemlerin türüne bağlı olacak şekilde bir boru hattı gibi düşünülebilir.

## Akış Oluşturmak(Obtain a Stream)
Java’da bir çok yolla akış oluşturulabilir. Yaygın olarak kullanılan Java Collections’lardır.

```
public class Main {
	List<String> list = Arrays.asList("Bir","Abc","BCD");
	Stream<String> stream = list.stream();
}
```

## Tamamlanmayan (Ara İşlemler — Non-Terminal) Operaötler

Akış üzerinden işlem yaparlar ve bu işlem sonucunda yine işlenebilecek bir akış dönerler. Bu yüzden birden fazla kez kullanılabilirler.

```
public class Main {
	List<String> list = Arrays.asList("Bir","Abc","BCD");
	Stream<String> stream = list.stream();
	// Tamamlanan Operatör
        	long count = stream .map((value) -> { return value.toLowerCase(); })
           			.count();
        	System.out.println("count = " + count);
          
	//Tamamlanmayan Operatör
	Stream<String> stream1 = stream.map((value) -> { return value.toLowerCase(); })
  				     .map((value) -> { return value.toUpperCase(); })
  				     .map((value) -> { return value.substring(0,3); });
 
}
```

Aşağıda en yaygın kullanılan operatörler mevcut. Şimdi bunlara daha yakından bakalım.

```
+------------------------+-----------------+
| Tamamlanan Operatörler | Ara Operatörler |
+------------------------+-----------------+
| toArray()              | filter()        |
| collect()              | map()           |
| count()                | distinct()      |
| reduce()               | sorted()        |
| forEach()              | limit()         |
| forEachOrdered()       | skip()          |
| min()                  | flatMap()       |
| max()                  | peek()          |
| anyMatch()             |                 |
| allMatch()             |                 |
| noneMatch()            |                 |
| findAny()              |                 |
| findFirst()            |                 |
+------------------------+-----------------+
```

Örneklerde kullanmak için bakalım Kişi sınıfını yakından inceleyelim. **Comparable** Arayüzünden implement ederek Kişi sınıfını oluşturuyoruz. Bu sınıfta kişiyi tanımlayacak özellikleri ve burada gösterilmeyen **getter** ve **setter**’ları oluşturuyoruz. 2 tane constructor yaratıyoruz. Ve **toString()** metodunu override ediyoruz. Yaşa göre sıralama yapabilmek için **compareTo()** metodunu override ediyoruz. Cinsiyet bilgisini ise **enum** şeklinde tanımlıyoruz. Oluşturduğumuz sınıf şu şekilde:

```
public class Kisi implements Comparable<Kisi> {
    private String adi;
    private String soyadi;
    private String email;
    private Cinsiyet cinsiyet;
    private int yas;
 
    public Kisi() {
    }
 
    public Kisi(String adi, String soyadi,
                  String email, Cinsiyet cinsiyet, int yas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }
    
    public int compareTo(Kisi another) {
        return this.yas - another.getYas();
    }
    public String toString() {
        return this.adi + " " + this.soyadi;
    }
}
 
public enum Cinsiyet { ERKEK, KADIN }
```

Sınıfımızda uygun kişileri yaratıp. Kişiler listesini oluşturuyoruz.

```
List<Kisi> kisiler = new ArrayList<>();
kisiler.add(new Kisi("Nur", "Mor", "nur@gmail.com", Cinsiyet.KADIN, 26));
kisiler.add(new Kisi("Ali", "Genç", "ali@gmail.com", Cinsiyet.ERKEK, 32));
kisiler.add(new Kisi("Fatma", "Tepe", "fatma@gmail.com", Cinsiyet.KADIN, 23));
kisiler.add(new Kisi("Davud", "Yeşil", "davud@gmail.com", Cinsiyet.ERKEK, 39));
kisiler.add(new Kisi("Ertan", "Genç", "ertan@gmail.com", Cinsiyet.ERKEK, 26));
kisiler.add(new Kisi("Can", "Caney", "can@gmail.com", Cinsiyet.ERKEK, 33));
kisiler.add(new Kisi("Emre", "Mor", "emre@gmail.com", Cinsiyet.ERKEK, 27));
kisiler.add(new Kisi("Halil", "Pastacı", "halil@gmail.com", Cinsiyet.ERKEK, 30));
kisiler.add(new Kisi("Hacer", "Tepe", "haver@gmail.com", Cinsiyet.KADIN, 22));
kisiler.add(new Kisi("Jale", "Simit", "jale@gmail.com", Cinsiyet.KADIN, 24));
```

**allMatch():** “Verilen koşula göre tüm elemanlar akışta mevcut mu?” sorusuna cevap veren operatördür. Eğer sorunun cevabı evet ise true, değil ise false değerini döner. Eğer akışın içinde uygun olmayan bir kayıt bulunursa akış anında sona erer.

**anyMatch():** “Verilen koşula göre en az bir tane eleman mevcut mu?” sorusunun cevabıdır. Eğer sorunun cevabı evet ise true, değil ise false değerini döner. Eğer akışın içinde bir tane uygun olan bir kayıt bulunursa akış anında sona erer.

**noneMatch():** ”Verilen koşul listede sağlanmıyor mu?” sorunusun cevabıdır. allMatch()operaötürünün tersidir.

**collect():** Akış türündeki nesneleri, başka biçimdeki nesneye veya veri yapısına dönüştürmek için kullanılır. Akış sonlandırmada en yaygın kullanılan operatördür.

**count() :** “Verilen koşula göre kaç tane elaman var?” sorusunun cevabını veren operatördür.

**forEach() :** Verilen koşulu listenin tüm elemanlarına uygulayan operatördür. Yan etki oluşturabilir.

**min(comparator):** Verilen koşula göre listede en küçük elemanı akış olarak dönen operatördür. Dönüş değeri Optinal tipindedir.

**max():** min() operatörün tersini yapan operatördür.

**reduce():** Verilen koşula göre listenin elemanlarında biriktirme işlemi yapan operatördür.Duruma göre Optional tipinde değer döner.

**filter():** Lamda ifadesiyle verilen koşulu sağlayan elemanları yeni bir akış şeklinde dönen operasyondur.

**map():** Mevcut akıştaki elaman verilen fonksiyonu uygulanmasından ortaya çıkan yeni akışı dönen fonksiyondur. Örneğin akıştaki elamanda bulunan nesneyi int tipinde yeni bir akışa döndürmek için bu operasyon kullanılır. 4 tane tipi mevcuttur.

1. **map():** uygulanan işlemin sonunda R tipinde yeni bir akış döner.
2. **mapToInt():** akışı int(primitif) tipinde yeni bir akışa dönüştürür.
3. **mapToLong():** akışı long(primitif) tipinde yeni bir akışa dönüştürür.
4. **mapToDouble():** takışı double(primitif) tipinde yeni bir akışa dönüştürür.

**sorted() / sorted(comparator):** Akışa verilen kurala göre sıralayıp yeni akış olarak dönen operatördür.

**distinct():** Akıştaki elemanları equals metoduna göre çokluyan kayıtları teke indiren operasyondur.

**skip():** Akışta belirtilen elemana kadar akıştaki elemanları atlayıp daha sonraki akışları işleme alan operatördür.

**Örnekler:**

```
// allMatch

boolean hepsiErkekMi = kisiler.stream()
                .allMatch(p -> p.getCinsiyet().equals(Cinsiyet.ERKEK));
 
System.out.println("Tüm kişiler erkek mi? " + hepsiErkekMi);  

//anyMatch

boolean enAzBirKadinVarMi = kisiler.stream()
                .anyMatch(p -> p.getCinsiyet().equals(Cinsiyet.KADIN));
 
System.out.println("En az bir kadın var mı? " + enAzBirKadinVarMi);

//noneMatch

boolean yahooMailAdresiYokMu = kisiler.stream()
            .noneMatch(p -> p.getEmail().endsWith("yahoo.com"));
 
System.out.println("Listede Yahoo mail adresli bir var mı? " + yahooMailAdresiYokMu);

//noneMatch

List<String> emailListesi = kisiler.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toList());
 
System.out.println("email Listesi: " + emailListesi);


Map<Cinsiyet, List<Kisi>> byCinsiyet= kisiler.stream()
            .collect(Collectors.groupingBy(p -> p.getCinsiyet()));
 
System.out.println("Cinsiyete göre gruplama:\n" + byCinsiyet);
// {KADIN=[KADINLARIN LISTESI], ERKEK=[ERKEKLERIN LISTESI]}

//count

long erkekSayisi = kisiler.stream()
            .filter(p -> p.getCinsiyet().equals(Cinsiyet.ERKEK))
            .count();
System.out.println("Erkek Sayısı: " + erkekSayisi);


//filter

System.out.println("Kadınlar:");
 
kisiler.stream()
    .filter(p -> p.getCinsiyet().equals(Gender.KADIN))
    .forEach(System.out::println);


//min

Optional<Person> enkucuk = kisiler.stream()
            .filter(p -> p.getCinsiyet().equals(Cinsiyet.KADIN))
            .min((p1, p2) -> p1.getYas() - p2.getYas());
if (enkucuk.isPresent()) {
    Kisi enGencKadin = enkucuk.get();
    System.out.println("En genç kadın: "
                + enGencKadin + " (" + enGencKadin.getYas() + ")");
}


//max

Optional<Kisi> max = kisiler.stream().filter(p -> p.getCinsiyet().equals(Cinsiyet.ERKEK))
            .max((p1, p2) -> p1.getYas() - p2.getYas());
if (max.isPresent()) {
    Person yasli = max.get();
    System.out.println("TEn yasli "  + yasli + " (" + yasli.getAge() + ")");}


// reduce

Optional<String> deger = ksiler.stream()
                    .map(p -> p.getAdi())
                    .reduce((adi1, adi2) -> adi1 + ", " + adi2);
 
if (deger.isPresent()) {
    String isimler = deger.get();
    System.out.println(isimler);
}

// reduce

int[] sayilar = {123, 456, 789, 246, 135, 802, 791};
 
int toplam = Arrays.stream(sayilar).reduce(0, (x, y) -> (x + y));
 
System.out.println("toplam = " + toplam);

// reduce

int[] sayilar = {123, 456, 789, 246, 135, 802, 791};
 
int toplam = Arrays.stream(sayilar).reduce(0, (x, y) -> (x + y), Integer::sum);
 
System.out.println("toplam = " + toplam);

// filter

kisiler.stream()
    .filter(p -> p.getCinsiyet().equals(Cinsiyet.ERKEK))
    .forEach(System.out::println);

//filter

kisiler.stream()
    .filter(p -> p.getCinsiyet().equals(Cinsiyet.KADIN) && p.getYas() <= 25)
    .forEach(System.out::println);

//map

kisiler.stream()
    .map(p -> p.getEmail())
    .forEach(System.out::println);
    
//map

kisiler.stream()
    .mapToInt(p -> p.getYas())
    .forEach(yas -> System.out.print(yas + " - "));

//map

kisiler.stream()
    .map(p -> p.getAdi().toUpperCase())
    .forEach(System.out::println);

// sorted

kisiler.stream()
    .sorted()
    .forEach(p -> System.out.println(p + " - " + p.getYas()));

//sorted

kisiler.stream()
    .sorted((p1, p2) -> p1.getSoyadi().compareTo(p2.getSoyadi()))
    .forEach(System.out::println);

//distinct

int[] numbers = {23, 58, 12, 23, 17, 29, 99, 98, 29, 12};
Arrays.stream(numbers)
      .distinct()
      .forEach(i -> System.out.print(i + " "));

//distinct

kisiler.stream()
    .map(p -> p.getSoyadi())
    .distinct()
    .sorted()
    .forEach(System.out::println);


// limit

kisiler.stream()
    .sorted()
    .limit(5)
    .forEach(System.out::println);
    

// skip

System.out.print("En büyük Yaş: ");
kisiler.stream()
    .sorted()
    .map(p -> p.getYas())
    .skip(kisiler.size() - 1)
    .forEach(System.out::println);

```