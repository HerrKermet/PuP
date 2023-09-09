package Exercise_09_State_Factory.State;

public class BadState implements BaseState {

    PlayerController playerController;
    public BadState(PlayerController pc) {
        this.playerController = pc;
    }

    @Override
    public void onEnter() {
        System.out.println("---BadState---");
        playerController.energy -= 2;
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
        System.out.println("Not able to train during bad mood");
        playerController.setState(playerController.badState);
    }

    @Override
    public void play() {
        System.out.println("Playing with pet");
        playerController.setState(playerController.happyState);
    }
}
