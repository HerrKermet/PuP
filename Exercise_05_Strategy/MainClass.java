package Exercise_05_Strategy;

public class MainClass {
    public static void main(String[] args){
        Strategy linux = new LinuxStrat();
        Strategy windows = new WindowsStrat();

        OS winOS = new OS(windows);
        OS linOS = new OS(linux);

        System.out.println(winOS.toString() + "  " + linOS.toString());
    }
}
