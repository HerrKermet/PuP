package Exercise_10_Template_Composite.Composite;

import java.util.ArrayList;

public class Directory implements FileSystemComponent{

    ArrayList<FileSystemComponent> childs = new ArrayList<>();
    private String name;

    Directory(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Directory: " + this.name);
        for(FileSystemComponent child : this.childs){
            child.print();
        }
    }

    @Override
    public int getSize() {
        int result = 0;
        for(FileSystemComponent child : this.childs){
            result += child.getSize();
        }
        return result;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void add(FileSystemComponent component){
        this.childs.add(component);
        System.out.println("Added " + component.getName());
    }

    public void remove(FileSystemComponent component){
        if (this.childs.remove(component)) {
            System.out.println("Removed " + component.getName());
        } else {
            System.out.println("Could not find " + component.getName());
        }
    }
}
