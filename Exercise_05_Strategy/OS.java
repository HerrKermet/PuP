package Exercise_05_Strategy;

public class OS {
    private Strategy strat;

    public OS(Strategy strat){
        this.strat = strat;
    }

    public String toString(){
        return strat.getOS();
    }

}
