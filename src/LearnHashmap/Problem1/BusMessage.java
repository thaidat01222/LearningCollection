package LearnHashmap.Problem1;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BusMessage {
    private Map<String, List<Message>> busMessageMap;

    public BusMessage(){
        busMessageMap = new ConcurrentHashMap<>();
    }

    public void sendMessage(Message m) {
        //TODO:
        //kiem tra co cai List tin nhan cua thang m.to chua
        // neu chua co, new Vector<Message> put m.to
        // them cai tin nhan moi nhan dc vao vector tren
        // put vector nay vao map
    }
}
