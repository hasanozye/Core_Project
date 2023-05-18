package Homeworks.day25;
/*Homework 2 for OOPDesigning class
Student isimli bir sınıf tasarlanmalıdır.
Öğrenciye ait bilgiler şunlar olacaktır;firstName:String lastName:String age:int grades:int[ ]
Tasarlanması gereken metotlar şunlardır;showInfo():void--> Örnek; Ahmet Dursun [47]
getGPA():double--> grades içerisine verilmiş olan notların ortalaması döndürülecektir.
Student():constructor--> Parametrik kullanımı isteğe bağlıdır. İsteyen yapabilir.
Program sınıfı - main metodu içerisinde;
İki adet Student nesnesi oluşturulacak ve gerekli atamalar yapılacaktır.
Daha sonra iki öğrencinin not ortalaması karşılaştırılıp büyük olan ekrana yazdırılacaktır.*/

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public int[] grades;


    public void showInfo() {
        System.out.printf("%s %s %d %.2f\n", firstName, lastName, age, getGPA());

    }

    public double getGPA() {
        double ort;
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        ort = sum / grades.length;
        return ort;
    }

    public Student(String firstN, String lastN, int a, int[] g) {
        firstName = firstN;
        lastName = lastN;
        age = a;
        grades = g;

    }

}
