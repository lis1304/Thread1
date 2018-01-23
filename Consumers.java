package thread1;


/**
 * Created by LIS on 18.01.2018.
 */
public class Consumers extends Thread {

    @Override
    public void run() {


        while (true) {
            try {
                Integer element = null;

                element = Producer.queue.poll();
                if (element == null){
                    wait();
                    Thread.sleep(1000);
                    element = Producer.queue.poll();
                    notify();
                }
                System.out.println(Thread.currentThread().getName() + " Вытащил: " + element);

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
