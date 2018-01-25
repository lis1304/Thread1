package thread1;


public class Consumers extends Thread {

    private synchronized int getElement() throws InterruptedException {

        int element = 0;
        try {
            element = Producer.queue.poll();

        } catch (NullPointerException e) {
            wait();
            while (true) {
                try {
                    element = Producer.queue.poll();
                    notify();
                    break;
                } catch (NullPointerException ee) {
                    sleep(10);
                }
            }
        }

        return element;
    }


    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(Thread.currentThread().getName() + " Вытащил: " + getElement()/*Producer.queue.poll()*/);
                //Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
