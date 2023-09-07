package Exercise_07_Command_Decorator.Exercise_07_Decorator;

public class PotionOfLife extends ItemDecorator{
    PotionOfLife(Character character) {
        super(character);
        this.description = " Has a Potion of Life.";
    }

    @Override
    public double getArmor() {
        return character.getArmor();
    }

    @Override
    public double getHp() {
        return character.getHp() + 5;
    }

    @Override
    public String getDescription() {
        return character.getDescription() + this.description;
    }
}
