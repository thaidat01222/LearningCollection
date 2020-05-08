package LearnHashmap.Problem1;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class BusMessage {
    private final Map<String, List<Message>> busMessageMap;

    public BusMessage(){
        busMessageMap = new ConcurrentHashMap<>();
    }
    public void sendMessage(Message m) {
        //kiem tra co cai List tin nhan cua thang m.to chua
        // neu chua co, new Vector<Message> put m.to
        // them cai tin nhan moi nhan dc vao vector tren
        // put vector nay vao map
        List<Message> messages = new Vector<>();
        if (busMessageMap.containsKey(m.getTo())) {
            busMessageMap.put(m.getTo(), messages);
            messages.add(m);
        } else messages.add(m);
    }
    public List<Message> getMessages(String userName){
        if(busMessageMap.get(userName) != null) {
            List<Message> cloneMessage =  busMessageMap.get(userName);
            busMessageMap.remove(userName);
            return cloneMessage;
            }
        return null;
    }

}
