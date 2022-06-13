package lab6;

public class OddtThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                System.out.println("");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
