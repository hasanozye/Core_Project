Konu: Hata yönetimi, exception

Bir şirket için B2B CRM uygulaması geliştirilecektir. Lütfen aşağıdaki Task'leri yerine getiriniz.

Task 1: Accountable isimli interface'i tasarlayınız.

Task 2: Belirtilen gövdesiz metotları tanımlayınız. void deposit(double amount) double getBalance() void withdraw(double amount)

Task 3: InsufficientBalanceException isimli bir hata sınıfı tasarlayınız. (Hata sınıfları Exception sınıfından extend edilebilir)

Task 4: Hata sınıfı için parametresiz constructor tasarlayınız. Constructor'dan ata sınıfa "Insufficient balance for the requested transaction." mesajını geçiniz.

Task 5: Contact sınıfını tasarlayınız.

Task 6: Contact sınıfı için id:int name:String email:String phoneNumber:String alanlarını tanımlayınız.

Task 7: Ayrıca Contact sınıfı içerisinde private static int ID_GENERATOR isimli değişken tanımlayınız.

Task 8: Contact sınıfı için parametreli constructor tasarlayınız. id dışındaki diğer alanları parametre olarak bildirip, assignment'larını yapınız. id alanı için this.id=++ID_GENERATOR; şeklinde assignment yapınız.

Task 9: Contact sınıfı için getter ve setter metotları tanımlayınız. id alanı için setter metodu ve ID_GENERATOR static alanı için getter ve setter metodu bulunmayacaktır.

Task 10: Contact sınıfında id, name ve email alanları için toString metodunu override ediniz.

Task 11: Customer sınıfını tasarlayınız.

Task 12: Customer sınıfı için id:int, name:String, owner:Contact, address:String, phoneNumber:String alanlarını tanımlayınız.

Task 13: Customer sınıfı içerisinde private static int ID_GENERATOR isimli değişken tanımlayınız.

Task 14: Customer sınıfı için parametreli constructor tasarlayınız. Sadece name alanını parametre olarak bildirip, atamasını yapınız. id alanı için this.id=++ID_GENERATOR; şeklinde assignment yapınız.

Task 15: static ID_GENERATOR alanı için getter-setter bulunmayacaktır.

Task 16: id alanı için sadece getter metodu tanımlanacaktır.

Task 17: Diğer alanlar için getter ve setter metotları tanımlanacaktır.

Task 18: Customer sınıfı içinde id, name ve owner alanları için toString metodu override edilmelidir.

Task 19: Customer sınıfı, Accountable isimli interface'i implemente etmelidir.

Task 20: Customer sınıfı için balance:double isimli private alan tanımlanmaldır.

Task 21: Accountable'dan implemente edilecek metotlar; deposit: balanc+=amount witdraw: balance-=amount getBalance: return balance

Task 22: withdraw metodunda eğer çekilecek miktar balance'tan fazla ise InsufficientBalanceException fırlatılmaldır. Bu hata metot içinde yönetilmemelidir.

Task 23: Main class - main metodu içerisinde bir adet Contact ve bir adet Customer nesnesi oluşturunuz. Gerekli assignment işlemlerini yazpınız.

Task 24: Bu nesneleri sout ile ekrana yazdırınız.

Task 25: Customer nesnesine para ekleme (deposit) ve para çekme (withdraw) işlemleri yapıp hata fırlatıldığını gözlemleyiniz.