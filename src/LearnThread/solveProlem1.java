package LearnThread;
import java.util.Vector;
import java.util.Random;

public class solveProlem1 {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> list = new Vector<>();
        ThreadA a = new ThreadA(list);
        ThreadB b = new ThreadB(list);
        a.start();
        b.start();
}}

class ThreadA extends Thread {
    private Vector<Integer> integers;
    ThreadA(Vector<Integer> integers) {
        this.integers = integers;
    }
    @Override
    public void run() {
        while(true) {
            Random rd = new Random();
            int number = rd.nextInt();
            synchronized (integers){
            integers.add(number);
                System.out.println("ThreadA "+number);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadB extends Thread{
    private Vector<Integer> integers;
    ThreadB(Vector<Integer> integers) {
        this.integers = integers;
    }
    @Override
    public void run(){
        int i = 0;
            while(true) {
                if(integers.size() > i ){
                System.out.println("ThreadB " +integers.get(i));
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}