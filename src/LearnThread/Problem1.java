package LearnThread;


import java.util.List;

public class Problem1 {
    List<Integer> list;
    GenerateRandomNumberThread generateRandomNumberThread = new GenerateRandomNumberThread(list);
    WorkerThread workerThread = new WorkerThread(list);

}

class GenerateRandomNumberThread extends Thread {
    List<Integer> list;

    GenerateRandomNumberThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            //them so ngau nhien vao list
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WorkerThread extends Thread {
    List<Integer> list;

    WorkerThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            //doc phan tu tiep theo trong list -> in ra so binh phuong.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}