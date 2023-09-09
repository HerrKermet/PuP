package Exercise_09_State_Factory.State;

public class HungryState implements BaseState {
    PlayerController playerController;
    public HungryState(PlayerController pc) {
        this.playerController = pc;
    }

    @Override
    public void onEnter() {
        System.out.println("---HungryState---");
        playerController.energy -= 2;
        playerController.printStats();
    }

    @Override
    public void onExit() {

    }

    @Override
    public void feed() {
        if(playerController.hunger > 10){
            playerController.hunger = 0;
            System.out.println("Yummy :D");
            playerController.setState(playerController.happyState);
        }else{
            System.out.println("Pet was not hungry. Now its angry >:(");
            playerController.setState(playerController.badState);
        }
    }

    @Override
    public void train() {
        System.out.println("Pet dont want to train");
        playerController.setState(playerController.hungryState);
    }

    @Override
    public void play() {
        System.out.println("Pet does not want to play  its hungry >:(");
    }
}
