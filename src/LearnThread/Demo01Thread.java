package LearnThread;

public class Demo01Thread {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter(0, 2);
        Counter counter2 = new Counter(2, 5);
        long start = System.currentTimeMillis();
        counter1.start();
        counter2.start();
        //join de counter1 va counter2 cung` doi nhau toi khi ca hai ket thuc.
        counter1.join();
        counter2.join();
        long end = System.currentTimeMillis();
        System.out.println("time " + (end - start));

        //cach 2
        /*Runnable counter3 = new Counter2();
        Thread thread = new Thread(counter3);
        thread.start();*/
    }
}

//
class Counter extends Thread {
    int start;
    int end;

    Counter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            System.out.println("counting..." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Counter2 implements Runnable {
    @Override
    public void run() {
        System.out.println("running...");
    }
}