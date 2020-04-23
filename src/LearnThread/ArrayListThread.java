package LearnThread;

import java.util.List;

public class ArrayListThread {
    public static void main(String[] args) throws InterruptedException {
        //arrayList - vector.
        //arrayList ko ho^~ tro. thread.
        //vector co' ho^~ tro. thread.
       /* ArrayList<String> arrayListString = new ArrayList<>();
        Vector<String> vectorString = new Vector<>();
        AT at = new AT(vectorString);
        AT at2 = new AT(vectorString);
        at.start();
        at2.start();
        at.join();
        at2.join();
        System.out.println(vectorString.size());*/
       ST st = new ST();
       ST st2 = new ST();
       st.start();
       st2.start();
       st.join();
       st2.join();
        System.out.println(ST.counter);
    }
}

class AT extends Thread {
    private List<String> as;

    AT(List<String> as) {
        this.as = as;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            as.add(".");
        }
    }
}

class ST extends Thread {
    public static int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter += 1;
        }
    }
}
