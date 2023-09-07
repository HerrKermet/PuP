package Exercise_07_Command_Decorator.Exercise_07_Command_1;

public class ActionSave implements ActionListenerCommand{
    Document document;
    ActionSave(Document doc){
        document = doc;
    }
    @Override
    public void execute() {
        System.out.println("ActionSave execute: ");
        document.save();
    }
}
