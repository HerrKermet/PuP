package Exercise_07_Command_Decorator.Exercise_07_Command_2;

public class AppendTextCommand implements EditorCommand{
    String textAlt;
    String textToAppend;
    TextEditor textEditor;

    AppendTextCommand(TextEditor editor, String text){
        this.textEditor = editor;
        this.textToAppend = text;
    }
    @Override
    public void execute() {
        this.textAlt = textEditor.getText();
        textEditor.update(textAlt + textToAppend);
    }

    @Override
    public void undo() {
        textEditor.update(textAlt);
    }
}
