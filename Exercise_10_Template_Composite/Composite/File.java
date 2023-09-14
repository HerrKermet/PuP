package Exercise_10_Template_Composite.Composite;

public class File implements FileSystemComponent{

    private String name;
    private int size;

    File(String name, int size){
        this.name = name;
        this.size = size;
    }
    @Override
    public void print() {
        System.out.println("File: " + this.name);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
