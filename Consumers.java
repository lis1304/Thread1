package thread1;


/**
 * Created by LIS on 18.01.2018.
 */
public class Consumers extends Thread {

    @Override
    public void run() {
        while (true) {
            try {

                System.out.println(Thread.currentThread().getName() + " Вытащил: " + Producer.queue.poll());
                Thread.sleep(1000);

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
