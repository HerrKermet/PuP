package Exercise_07_Command_Decorator.Exercise_07_Command_1;

public class ActionOpen implements ActionListenerCommand{

    Document document;

    ActionOpen(Document doc){
        document = doc;
    }
    @Override
    public void execute() {
        System.out.println("ActionOpen execute: ");
        document.open();
    }
}
