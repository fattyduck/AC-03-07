package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/7/15.
 */
import java.util.Scanner;

public class madlib {
    public static void main(String[] args){
        String name, ani, weight, dinner, drink, silverw;
        Scanner cow=new Scanner(System.in);
        System.out.println("What is your name?");
        name=cow.nextLine();
        System.out.println("What is your favorite animal?");
        ani =cow.nextLine();
        System.out.println("What is your weight (in pounds)?");
        weight=cow.nextLine();
        System.out.println("What is your favorite food?");
        dinner=cow.nextLine();
        System.out.println("What is your favorite beverage?");
        drink=cow.nextLine();
        System.out.println("What is your favorite silverware?");
        silverw=cow.nextLine();


        System.out.println("\nHere is your madlibs!");
        System.out.println("\n" + name+ " and a " +weight + " pound " + ani+ " was eating " + dinner+ " with a " + silverw+ " and drinking " + drink  );
    }
}