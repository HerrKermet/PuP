package Exercise_09_State_Factory.State;

public class PlayerController {
    public int energy = 10;
    public int hunger = 0;
    public BaseState currentState;

    BaseState happyState = new HappyState(this);
    BaseState badState = new BadState(this);

    BaseState hungryState = new HungryState(this);

    BaseState sleepState = new SleepState(this);

    PlayerController(){
        this.currentState = this.happyState;
        this.currentState.onEnter();
    }

    public void setState(BaseState nextState){
        this.currentState.onExit();
        this.currentState = nextState;
        this.currentState.onEnter();
    }

    public void printStats(){
        System.out.println("Energy: " + this.energy + "  Hunger: " + this.hunger);
    }

}
