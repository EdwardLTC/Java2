package lab6;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread even = new EvenThread();
        OddtThread odd = new OddtThread();
        even.start();
        even.join();
        odd.start();
        System.out.println("Ehe, denaitayo :>");
    }
}
