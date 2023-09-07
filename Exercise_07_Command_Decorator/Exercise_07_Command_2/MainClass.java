package Exercise_07_Command_Decorator.Exercise_07_Command_2;

public class MainClass {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor("");
        CommandManager commandManager = new CommandManager();
        AppendTextCommand appendTextCommand = new AppendTextCommand(textEditor, "First append.");

        AppendTextCommand secondAppendTextCommand = new AppendTextCommand(textEditor, "second append.");

        commandManager.executeCommand(appendTextCommand);
        commandManager.executeCommand(secondAppendTextCommand);
        commandManager.undo();
    }

}
