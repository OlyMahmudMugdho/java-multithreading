package BasicMultithreadingWithRunnable;

public class BasicMultiThreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo());
        t1.start();
        t2.start();
    }
}
