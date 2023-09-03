package Exercise_05_Strategy;

public class LinuxStrat implements Strategy {
    @Override
    public String getOS() {
        return ("Linux");
    }
}
