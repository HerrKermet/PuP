package Custom.Self_Decorator;

public class Cake implements Ingredient{
    Ingredient tempMix;

    public Cake(Ingredient oldMix){
        this.tempMix = oldMix;
    }
    @Override
    public double getCost() {
        return this.tempMix.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return this.tempMix.getDescription() + "Batter ";
    }
}
