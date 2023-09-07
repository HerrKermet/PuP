package Exercise_07_Command_Decorator.Exercise_07_Command_1;

public class Benutzer {
    public static void main(String[] args){
        Document document = new Document("test");

        ActionListenerCommand open = new ActionOpen(document);
        ActionListenerCommand save = new ActionSave(document);
        MenuOptionen menu = new MenuOptionen(open, save);

        menu.clickOpen();
        menu.clickSave();
    }
}
