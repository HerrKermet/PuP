package Exercise_06_Observer;

import java.util.ArrayList;

public class ChatClient {

    ArrayList<IChatObserver> observers;

    public ChatClient(){
        this.observers = new ArrayList<>();
    }

    public void registerObserver(IChatObserver observer){
        this.observers.add(observer);
    }

    public void deregisterObserver(IChatObserver observer){
        this.observers.remove(observer);
    }

    void writeMessage(Message msg){
        // Iterate over each subscriber and notify them with new msg
        for (IChatObserver observer : this.observers){
            observer.update(msg);
        }
    }
}
