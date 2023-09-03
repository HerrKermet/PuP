package Exercise_06_Observer;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Message {
    private Date timestamp;
    private String text;

    private String receiver;

    private String sender;


    public Message(String text, String sender, String receiver){
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
        timestamp = new Date();
    }


    public Date getTimestamp() {
        return timestamp;
    }

    public String getText() {
        return text;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSender() {
        return sender;
    }
}
