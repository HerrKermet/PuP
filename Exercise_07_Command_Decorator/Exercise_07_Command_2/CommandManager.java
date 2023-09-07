package Exercise_07_Command_Decorator.Exercise_07_Command_2;

import java.util.Stack;

public class CommandManager{
    private Stack<EditorCommand> undoStack;

    CommandManager(){
        this.undoStack = new Stack<>();
    }
    public void executeCommand(EditorCommand cmd){
        this.undoStack.push(cmd);
        cmd.execute();
    }

    public void undo() {
        EditorCommand cmd = this.undoStack.pop();
        cmd.undo();
    }



}
