/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Edward
 */
public class EdwardThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n "+ i  );
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    public static void main(String[] args) {
        EdwardThread t1 = new EdwardThread();
        EdwardThread t2 = new EdwardThread();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
