package Exercise_07_Command_Decorator.Exercise_07_Command_2;

public class TextEditor {
    private String text;

    TextEditor(String text){
        this.text = text;
    }

    public void update(String text){
        this.text = text;
        System.out.println("Updated text: " + this.text);
    }

    public String getText(){
        return this.text;
    }
}
