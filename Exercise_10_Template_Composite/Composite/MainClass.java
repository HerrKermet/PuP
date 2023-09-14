package Exercise_10_Template_Composite.Composite;
public class MainClass {
    public static void main(String[] args){
        Directory root = new Directory("root");
        Directory documents = new Directory("documents");
        Directory images = new Directory("images");
        Directory urlaubImages = new Directory("urlaub");

        urlaubImages.add(new File("img1", 5));
        urlaubImages.add(new File("img2", 1));

        images.add(urlaubImages);
        images.add(new File("img2020123", 10));

        documents.add(new File("CV-2023", 5));
        documents.add(new File("Bewerbung-2023", 6));
        documents.add(new File("Studienbescheinigung", 4));

        root.add(documents);
        root.add(images);

        root.print();
        System.out.println(root.getSize());


    }
}
