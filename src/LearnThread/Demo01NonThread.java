package LearnThread;

public class Demo01NonThread {
    //in ra man hinh tu 0 -> 100.000
    public static void main(String[] args) throws InterruptedException {
        // X
        long start = System.currentTimeMillis();
        int k = 0;
        for (int i = 0; i < 5; i++) {
            k++;
            System.out.println("counting...."+ k);
            Thread.sleep(1000);
        }
        //1/1/1970
        //Y
        long end = System.currentTimeMillis();
        System.out.println(k);
        System.out.println("time: " + (end - start));
    }
}
