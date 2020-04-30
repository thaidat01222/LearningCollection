package LearnHashmap.Problem1;
import java.time.LocalDate;
import java.util.Random;
    public class SolveProblem1 {
        public static void main(String[] args) {
            //tao tong dai
            BusMessage busMessage = new BusMessage();
            //tao user
             User[] users = new  User[10];
            for (int i = 0; i < 10; i++) {
                users[i] = new  User("User" + i);
            }
            for(int i = 0 ; i< 100; i++){
                 threadCreateRandomMessage a = new  threadCreateRandomMessage();
                a.start();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class threadCreateRandomMessage extends Thread  {
        private User[] user ;
        private BusMessage busMessage;
        @Override
        public void run(){
            int indexOfUser[] = {0,1,2,3,4,5,6,7,8,9};
            Random random = new Random();
            int randomIndexUserFrom = random.nextInt(indexOfUser.length);
            int randomIndexUserTo = random.nextInt(indexOfUser.length);
            String indexOfContent[] = new String[100];
            for(int i = 1 ; i < 101 ; i++){
                indexOfContent[i] = "message" +i;
            }
            String randomMessage = indexOfContent[(int) (Math.random()*100)];
            LocalDate today = LocalDate.now();
             Message message = new Message(user[randomIndexUserFrom].getName(),user[randomIndexUserTo].getName(), randomMessage,today);
            busMessage.sendMessage(message);
        }
    }