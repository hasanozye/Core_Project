package day60;

public class Aslan extends Hayvan implements Runnable {

    private Thread th;
    public Aslan() {
//        new Thread(this).start();
    }

    public void ilerle(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aslan %d metre ilerledi. \n", (i + 1) * 10);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
    }

}
