package Exercise_07_Command_Decorator.Exercise_07_Decorator;

public class Mischa implements Character{
    @Override
    public double getArmor() {
        return 2;
    }

    @Override
    public double getHp() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Ist ein Mischa.";
    }
}
