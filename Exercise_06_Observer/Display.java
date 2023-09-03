package Exercise_06_Observer;

public class Display implements IChatObserver{
    @Override
    public void update(Message msg) {
        System.out.println("-------------------\n" + msg.getTimestamp() + "\nFrom: " + msg.getSender() + "  To: " + msg.getReceiver() + " \n" + msg.getText() + "\n-------------------\n");
    }
}
