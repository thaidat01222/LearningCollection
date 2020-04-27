package LearnHashmap.Problem1;

import java.util.Date;

public class Message {
    private String from;
    private String to;
    private String content;
    private Date date;

    public Message() {

    }

    public Message(String from, String to, String content, Date date) {
        this.from = from;
        this.to = to;
        this.content = content;
        this.date = date;
    }
}
