package Exercise_07_Command_Decorator.Exercise_07_Command_1;

public class MenuOptionen {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    MenuOptionen(ActionListenerCommand open, ActionListenerCommand save){
        this.openCommand = open;
        this.saveCommand = save;
    }

    public void clickOpen(){
        this.openCommand.execute();
    }

    public void clickSave(){
        this.saveCommand.execute();
    }
}
