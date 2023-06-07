package day44;

public class MainApp {
    public static void main(String[] args) {
        /*
        The advantages of Exceptiın Handling in Java are as follows:


        1.Provision to Complete Program Execution: Programların çalışmasının (yürütülmesinin) tamamlanması için önlem
        2. Easy Identificatiın of Program Code and Error-Handling Code: Program kodu içinde hata yönetiminin kolayca ele alınabilmesi
        3. Propagation of Errors: Hataların, metotların çağrıldığı yere yayılabilmesi
        4. Meaningful Error Reporting: Error Reporting: Güzel bir şekilde hataların raporlandırılabilmesi
        5. Identifying Error Types:Hata türlerinin belirleyebilme

        Keywords
        1. try
        2. catch
        3. finally
        4. throw
        5. throws
         */

//        Kullanım yöntemleri:
//        1. try-catch

        try {
            int sayac = 0;
            String[] isimler = {"Ali", "Veli", "Ayşe", "Fatma"};
            sayac = 4;
            System.out.println(isimler[sayac]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Hata: " + ex.getMessage());
        }

        int[] dizi = new int[]{3, 5, 7, 9};


        double average = calculateAverage(dizi);
        System.out.println("average = " + average);


    }

    public static double calculateAverage(int[] values) {
        double sum = 0.0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }


}
