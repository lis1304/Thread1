package thread1;


import java.util.LinkedList;
import java.util.Queue;

public class Producer extends Thread{
    private final int begNum = 1;
    private final int endNum = 100;
    public static Queue<Integer> queue = new LinkedList<>();



    private int random(){
        int randNum=0;
        randNum += begNum + (int) (Math.random()*endNum);
        return randNum;
    }

    @Override
    public void run() {

        while (true){

            queue.add(random());
            notify();
            //Thread.sleep(500);
        }

    }
}
