package Exercise_09_State_Factory.State;

public class SleepState implements BaseState {

    PlayerController playerController;
    public SleepState(PlayerController pc) {
        this.playerController = pc;
    }

    @Override
    public void onEnter() {
        playerController.energy += 4;
        System.out.println("---SleepState---");
        playerController.printStats();
    }

    @Override
    public void onExit() {
        if(playerController.energy >= 16){
            System.out.println("Pet awakes");
        }

    }

    @Override
    public void feed() {
        System.out.println("Pet eats and gets happy");
        playerController.hunger = 0;
        playerController.setState(playerController.happyState);

    }

    @Override
    public void train() {
        System.out.println("You disturbed Pets sleep >:(");
        playerController.setState(playerController.badState);
    }

    @Override
    public void play() {
        System.out.println("You disturbed Pets sleep >:(");
        playerController.setState(playerController.badState);
    }
}
