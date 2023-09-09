package Custom.Self_Decorator;

public class ChocolateIcing implements Ingredient{

    Ingredient tempMix;

    public ChocolateIcing(Ingredient oldMix){
        this.tempMix = oldMix;
    }
    @Override
    public String getDescription() {
        return this.tempMix.getDescription() + "Chocolate_Icing ";
    }

    @Override
    public double getCost() {
        return this.tempMix.getCost() + 2.5;
    }
}
