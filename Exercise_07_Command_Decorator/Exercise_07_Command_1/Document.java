package Exercise_07_Command_Decorator.Exercise_07_Command_1;

import java.io.File;

public class Document {
    private File file;
    private String path;

    Document(String name){
        file = new File(name + ".txt");
        path = file.getPath();
    }
    Document(String name, String type){
        file = new File(name + type);
        path = file.getPath();

    }

    public void open(){
        System.out.println("Opened file: " + path);
    }

    public void save(){
        System.out.println("Saved file: " + path);
    }

    public String getPath(){
        return this.path;
    }

}
