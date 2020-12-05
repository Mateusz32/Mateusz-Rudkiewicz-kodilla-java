package PaperRockScissor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

    // The class ask name and quantity of rounds to play

    private String name;
    private int numberOfRounds;
    Scanner player = new Scanner(System.in);

    public void askName() {
        System.out.println("Enter Your name:");
        name = player.nextLine();
    }

    public int askNumberOfRounds() {
        boolean start = true;
        while (start) {
            System.out.println("How many rounds do You want to play?");
            try {
                numberOfRounds = Integer.parseInt(player.nextLine());
                if (numberOfRounds <= 0) {
                    System.out.println("Incorrect value. Try again");
                } else {
                    start = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Inncoret value");
                //start=false;
            }


        }
        return numberOfRounds;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
