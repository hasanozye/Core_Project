package day22;

public class LoopLabels {
    public static void main(String[] args) {
        Etilet1:
        for (int i = 0; i < 10; i++) {
            Etiket2:
            for (int j = 0; j < 10; j++) {
                if (i*j!=0){
//                    break Etilet1;
                    break Etiket2;
                }
                System.out.printf("%dx%d\n",i,j);

            }
            System.out.println();
        }
    }
}
