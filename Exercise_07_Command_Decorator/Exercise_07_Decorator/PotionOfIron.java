package Exercise_07_Command_Decorator.Exercise_07_Decorator;

public class PotionOfIron extends ItemDecorator{
    PotionOfIron(Character character) {
        super(character);
        this.description = " Has an Iron Potion";
    }

    @Override
    public double getArmor() {
        return this.character.getArmor() + 5;
    }

    @Override
    public double getHp() {
        return this.character.getHp();
    }

    @Override
    public String getDescription() {
        return this.character.getDescription() + this.description;
    }
}
