package LearnHashmap.Problem1;
import java.util.List;
public class User {
    private String name;
    private List<Message> messageList;
    public User(String name, List<Message> messages) {
        this.name = name;
        this.messageList = messages;
    }
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Message> getMessageList() {
        return messageList;
    }
    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
    @Override
    public String toString(){
        return "User " +getName();
    }
}
