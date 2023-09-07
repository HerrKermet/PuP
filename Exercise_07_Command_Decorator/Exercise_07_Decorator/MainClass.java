package Exercise_07_Command_Decorator.Exercise_07_Decorator;

public class MainClass {
    public static void main(String[] args){
        Character mischa = new Mischa();
        mischa = new PotionOfIron(mischa);
        mischa = new PotionOfLife(mischa);

        System.out.println(mischa.getDescription());
    }
}
