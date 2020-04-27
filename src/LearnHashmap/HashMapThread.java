package LearnHashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class HashMapThread {
    public static void main(String[] args) {
        Map<String, String> stringStringHashMap = new ConcurrentHashMap<>();

        //ArrayList -> Vector. ( han che dung vector) -> Collections.SynchronizedList()
        //Hashmap -> ConcurrentHashMap , Collections.SynchronizedMap() (han che)
        ThreadA threadA = new ThreadA();
        threadA.setMap(stringStringHashMap);
        threadA.start();
    }
}


class ThreadA extends Thread {
    private Map<String, String> stringStringMap;

    ThreadA(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    ThreadA(){}

    void setMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    @Override
    public void run() {
        this.stringStringMap.keySet().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
