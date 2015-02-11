import java.util.Scanner;

/**
 * Created by romanwendelboe on 8/30/14.
 */

import java.util.*;
public class RaptorMain {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Raptor Quiz 2014... ");
        System.out.println("Please enter your name: ");
        String name = console.nextLine();

        boolean quit = false;

        while(!quit) {

            System.out.println("How would " + name + " like to survive?:");
            System.out.println("#1 Running: ");
            System.out.println("#2 Hiding: ");
            System.out.println("#3 Just Giving Up: ");

            int input;
            input = console.nextInt();

            switch (input) {
                case 1:
                    double speed;

                    if (name.equalsIgnoreCase("Usain Bolt")) {

                        System.out.println("Enter " + name + "'s top speed in m/s, with max of 12.27 m/s:");
                        speed = console.nextDouble();
                        while (speed > 12.27) {
                            System.out.println("Try again that's way to fast");
                            System.out.println("Enter " + name + "'s top speed in m/s, with max of 12.27 m/s:");
                            speed = console.nextDouble();
                        }

                    } else {

                        System.out.println("Enter " + name + "'s top speed in m/s, with max of 10 m/s:");
                        speed = console.nextDouble();
                        while (speed > 10) {

                            System.out.println("Don't lie you can't run that fast");
                            System.out.println("Enter " + name + "'s top speed in m/s, with max of 10 m/s:");
                            speed = console.nextDouble();
                        }
                    }

                    System.out.println("Enter starting distance from the raptor, in meters:");
                    double Initialdistance;
                    Initialdistance = console.nextDouble();

                    int seconds = 0;
                    double Finaldistance = Initialdistance;
                    double RaptorsSpeed = 0;
                    while (Finaldistance >=0) {

                        seconds++;
                        if (seconds == 1) RaptorsSpeed = 4;
                        else if (seconds == 2) RaptorsSpeed = 12;
                        else if (seconds >= 3) RaptorsSpeed = 25;

                        Finaldistance = Initialdistance + (speed - RaptorsSpeed);
                        Initialdistance = Finaldistance;

                    }

                    System.out.printf(name + " would survive approximately " + seconds + " seconds%n%n");
                    break;
                case 2:
                    int PersonRoom;
                    int RaptorRoom;

                    System.out.println("Which room would you like to start in? Your input is 1-6:");
                    PersonRoom = console.nextInt();
                    System.out.println("Which room would you like the raptor to start in? Input 1-6:");
                    RaptorRoom = console.nextInt();

                    if((PersonRoom == 1 && RaptorRoom == 6) || (PersonRoom == 6 && RaptorRoom== 1)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 8.75 minutes to live");
                        else System.out.println("You have 8.75 minutes to live");
                    }
                    if((PersonRoom == 2 && RaptorRoom == 5 )|| (PersonRoom == 5 && RaptorRoom== 2) ){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 5 minutes to live");
                        else System.out.println("You have 5 minutes to live");
                    }
                    if((PersonRoom == 1 && RaptorRoom == 2) || (PersonRoom == 2 && RaptorRoom== 1)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 5 minutes to live");
                        else System.out.println("You have 5 minutes to live");
                    }
                    if((PersonRoom == 1 && RaptorRoom == 4) || (PersonRoom == 4 && RaptorRoom== 1)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 5 minutes to live");
                        else System.out.println("You have 5 minutes to live");
                    }
                    if((PersonRoom == 1 && RaptorRoom == 3) || (PersonRoom == 3 && RaptorRoom== 1)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 7.5 minutes to live");
                        else System.out.println("You have 7.5 minutes to live");
                    }
                    if((PersonRoom == 1 && RaptorRoom == 5) || (PersonRoom == 5 && RaptorRoom== 1)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 7.5 minutes to live");
                        else System.out.println("You have 7.5 minutes to live");
                    }
                    if((PersonRoom == 2 && RaptorRoom == 3) || (PersonRoom == 3 && RaptorRoom== 2)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 5 minutes to live");
                        else System.out.println("You have 5 minutes to live");
                    }
                    if((PersonRoom == 2 && RaptorRoom == 4) || (PersonRoom == 4 && RaptorRoom== 2)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 7.5 minutes to live");
                        else System.out.println("You have 7.5 minutes to live");
                    }
                    if((PersonRoom == 2 && RaptorRoom == 6) || (PersonRoom == 6 && RaptorRoom== 2)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 7.5 minutes to live");
                        else System.out.println("You have 7.5 minutes to live");
                    }
                    if((PersonRoom == 3 && RaptorRoom == 4) || (PersonRoom == 4 && RaptorRoom== 3)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 8.75 minutes to live");
                        else System.out.println("You have 8.75 minutes to live");
                    }
                    if(PersonRoom == 3 && RaptorRoom == 5 || PersonRoom == 5 && RaptorRoom== 3){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 7.5 minutes to live");
                        else System.out.println("You have 7.5 minutes to live");
                    }
                    if((PersonRoom == 3 && RaptorRoom == 6) || (PersonRoom == 6 && RaptorRoom== 3)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 5 minutes to live");
                        else System.out.println("You have 5 minutes to live");
                    }
                    if((PersonRoom == 4 && RaptorRoom == 5) || (PersonRoom == 5 && RaptorRoom== 4)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 5 minutes to live");
                        else System.out.println("You have 5 minutes to live");
                    }
                    if((PersonRoom == 4 && RaptorRoom == 6) || (PersonRoom == 6 && RaptorRoom== 4)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 7.5 minutes to live");
                        else System.out.println("You have 7.5 minutes to live");
                    }
                    if((PersonRoom == 5 && RaptorRoom == 6) || (PersonRoom == 6 && RaptorRoom== 5)){

                        if(name.equalsIgnoreCase("Chuck Norris")) System.out.println("Raptor has 5 minutes to live");
                        else System.out.println("You have 5 minutes to live");
                    }
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input make sure your number is between 1-3");
                    break;


            }


        }
}
}
