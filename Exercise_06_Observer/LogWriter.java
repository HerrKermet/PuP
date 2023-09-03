package Exercise_06_Observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter implements IChatObserver{
    File log;

    public LogWriter(String name){
        log = new File("./" + name + ".txt");
    }
    @Override
    public void update(Message msg) {
        //Save msg in textfile
        try {
            FileWriter writer = new FileWriter(this.log, true);
            writer.append(String.format("----------\n%s\nFrom: %s To: %s\n%s\n----------\n",msg.getTimestamp().toString(), msg.getSender(), msg.getReceiver(), msg.getText()));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
