package thread1;


public class App {
    public static void main(String[] args) throws InterruptedException {

        Producer producer = new Producer();

        Consumers consumers1 = new Consumers();
        Consumers consumers2 = new Consumers();
        Consumers consumers3 = new Consumers();
        Consumers consumers4 = new Consumers();
        Consumers consumers5 = new Consumers();

        producer.start();

        consumers1.start();
        consumers2.start();
        consumers3.start();
        consumers4.start();
        consumers5.start();

    }
}

