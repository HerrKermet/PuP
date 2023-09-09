package Custom.Self_Decorator;

public class MainClass {

    public static void main(String[] args){

        Ingredient cake = new Cream(new ChocolateIcing(new Cake(new Base())));
        System.out.println("Ingredients: " + cake.getDescription() + " Price: " + cake.getCost());

    }


}
