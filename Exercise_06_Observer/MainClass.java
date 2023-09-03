package Exercise_06_Observer;

public class MainClass {

    public static void main(String[] args){

        ChatClient chatClient = new ChatClient();
        Display display = new Display();
        LogWriter logWriter = new LogWriter("Log");

        chatClient.registerObserver(display);
        chatClient.registerObserver(logWriter);

        Message message1 = new Message("Hallo an alle  das ist die erste Nachricht", "David", "Everyone");
        Message message2 = new Message("Eine weitere Nachricht", "David", "Everyone");

        chatClient.writeMessage(message1);
        chatClient.writeMessage(message2);
    }

}
