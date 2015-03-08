package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/7/15.
 */
import com.apple.eawt.SystemSleepListener;

import java.util.Scanner;

public class gRes {
public static void main(String[] args){
    String  greet;
    Scanner cow=new Scanner(System.in);
    System.out.println("Please greet the holy Duck!");
    greet=cow.nextLine();
    if(greet.equals("How are you?")){
        System.out.println("not bad, human");
    }else if(greet.equals("Good morning")){
        System.out.println("mornings, human");
    }else if(greet.equals("Good afternoon")){
        System.out.println("afternoons, human");
    }else if(greet.equals("Good evening")){
        System.out.println("evenings, human");
    }else if(greet.equals("Good night")){
        System.out.println("nitez, human");
    }else {
        System.out.println("You have been slain for being impolite to the Holy Duck!");
    }
}
}
