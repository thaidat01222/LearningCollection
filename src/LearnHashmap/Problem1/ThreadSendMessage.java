package LearnHashmap.Problem1;

public class ThreadSendMessage  extends Thread{
    private BusMessage busMessage;
    public ThreadSendMessage(BusMessage busMessage) {
        this.busMessage = busMessage;
    }

    @Override
    public void run() {
        while(true){
            //sinh ra messages
            Message message = generateRandomMessage();
            busMessage.sendMessage(message);
            //doi 0.1s
        }
    }

    public Message generateRandomMessage(){
        //
        return null;
    }
}
