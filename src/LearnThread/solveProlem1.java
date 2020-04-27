package LearnThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class solveProlem1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> synchronizedList = Collections.synchronizedList(list);
//        Vector performance
        ThreadA a = new ThreadA(synchronizedList);
        ThreadB b = new ThreadB(synchronizedList);
        a.start();
        b.start();
    }
}

class ThreadA extends Thread {
    private final List<Integer> integers;

    ThreadA(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public void run() {
        while (true) {
            Random rd = new Random();
            int number = rd.nextInt();
            integers.add(number);
            System.out.println("ThreadA " + number);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadB extends Thread {
    private final List<Integer> integers;

    ThreadB(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            if (integers.size() > i) {
                System.out.println("ThreadB " + integers.get(i));
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