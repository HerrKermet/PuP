package Exercise_09_State_Factory.State;

public class HappyState implements BaseState {

    PlayerController playerController;
    HappyState(PlayerController pc){
        this.playerController = pc;
    }
    @Override
    public void onEnter() {
        System.out.println("---HappyState---");
        playerController.energy -= 1;
        playerController.printStats();
        if(playerController.energy <= 0){
            System.out.println("Too tired. Transition to sleep");
            playerController.setState(playerController.sleepState);
        }
        if(playerController.hunger > 10){
            System.out.println("Too hungry. Transition to hungry");
            playerController.setState(playerController.hungryState);
        }
    }

    @Override
    public void onExit() {
        playerController.hunger += 1;
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
        System.out.println("Trained.  Now transition to bad mood");
        playerController.setState(playerController.badState);
    }

    @Override
    public void play() {
        System.out.println("Playing with pet");
        playerController.setState(playerController.happyState);
    }
}
