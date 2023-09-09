package Exercise_09_State_Factory.State;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        PlayerController pc = new PlayerController();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("feed, train, play");
            String input = s.nextLine();
            if(input.contains("train")){
                pc.currentState.train();
            }else if(input.contains("feed")){
                pc.currentState.feed();
            }else if(input.contains("play")){
                pc.currentState.play();
            }else{
                System.out.println("Invalid input  try again");
            }
        }
    }
}
