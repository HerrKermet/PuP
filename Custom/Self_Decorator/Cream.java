package Custom.Self_Decorator;

public class Cream implements Ingredient{

    Ingredient tempMix;

    public Cream(Ingredient oldMix){
        this.tempMix = oldMix;
    }

    @Override
    public String getDescription() {
        return this.tempMix.getDescription() + "Cream ";
    }

    @Override
    public double getCost() {
        return this.tempMix.getCost() + 1.5;
    }
}
