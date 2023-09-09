package Exercise_09_State_Factory.State;

public interface BaseState {


    public void onEnter();

    public void onExit();

    public void feed();

    public void train();

    public void play();
}
