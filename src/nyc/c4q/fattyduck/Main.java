package nyc.c4q.fattyduck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("good morning silly");
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of animal are you?");
        String aniRace;
        Double price;
        aniRace=input.nextLine();

        if(aniRace.equals ("duck")){
            price=1.25;
            System.out.print("Dear " + aniRace + ", the cost of your ticket is " +price+ " mesos");

        }else if(aniRace.equals("panda")){
            price=2.5;
            System.out.print("Dear " + aniRace + ", the cost of your ticket is " +price+ " mesos");
        }else if (aniRace.equals("human")){
            price=115.99;
            System.out.print("Dear " + aniRace + ", the cost of your ticket is " +price+ " mesos");
        }else{
            System.out.println("Get out of here");
        }

    }
}
