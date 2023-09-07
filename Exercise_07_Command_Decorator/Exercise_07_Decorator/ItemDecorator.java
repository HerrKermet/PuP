package Exercise_07_Command_Decorator.Exercise_07_Decorator;

public abstract class ItemDecorator implements Character {
    protected Character character;

    protected String description;

    ItemDecorator(Character character){
        this.character = character;
    }
}
