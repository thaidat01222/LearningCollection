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
            System.out.println("aaaa");
            Random rd = new Random();
            int number = rd.nextInt();
            synchronized (integers){
            integers.add(number);
                System.out.println(number);
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
        if(integers.size()!= 0 ){
            while(true) {
                System.out.println("bbbbbb");
                System.out.println(integers.get(i));
                i++;
                try {
                    Thread.sleep(2050);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}