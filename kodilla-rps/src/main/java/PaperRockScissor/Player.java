package PaperRockScissor;

import java.util.Scanner;

public class Player {

    // Klasa prosi o imie i ilosc rund do gry zapętla
    //jeśli podana wartość rund jest ujemna

    private String name;
    private int numberOfRounds;
    Scanner player = new Scanner(System.in);

    public void askName() {
        System.out.println("Wpisz swoje imie:");
        name = player.next();
    }

    public void askNumberOfRounds() {
        boolean start = true;
        while (start) {
            System.out.println("Do ilu zwycięst chcesz grać?");
            numberOfRounds = player.nextInt();

            if (numberOfRounds <= 0) {
                System.out.println("Wpisłaś niewłaściową liczbę rund");
            } else {
                start = false;
            }
        }
    }


    public String getName() {
        return name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
