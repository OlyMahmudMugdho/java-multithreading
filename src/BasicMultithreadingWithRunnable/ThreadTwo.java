package BasicMultithreadingWithRunnable;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Thread Two " + i);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
