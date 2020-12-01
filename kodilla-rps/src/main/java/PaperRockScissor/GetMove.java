package PaperRockScissor;

import java.util.Scanner;

public class GetMove {

    String playerMove;
    Scanner puntMove = new Scanner(System.in);
    Moves move = new Moves();
    Scanner decision = new Scanner(System.in);
    boolean start;
    boolean end;

    GetMove(){}

    GetMove(boolean start, boolean end) {
        this.start = start;
        this.end = end;
    }

    String playerMove() {
        boolean start = true;

        while (start) {
            System.out.println("Proszę wykonać ruch 1-,2-,3-,x,n");
            playerMove = puntMove.next();
            if (move.isCorrectMove(playerMove)) {
                start = false;
            } else {
                System.out.print("Podałeś złą wartość!!! ");
                start = true;
            }
        }
        return playerMove;
    }

    public String getWybórGracza() {
        return playerMove;
    }

    GetMove doFinishOrBegin(GetMove getMove, String playerMove) {

        if (playerMove.equals("x")) {
            System.out.println("Czy napewno zakończyć grę? Yes=y, No=any button");
            String decysion = decision.next().toLowerCase();
            if (decysion.equals("y")) {
                start = false;
                end = true;
            } else {
                end = false;
            }
        } else if (playerMove.equals("n")) {
            System.out.println("Czy napewno chcesz zacząć grę od nowa? Yes=y, No=any button");
            String decysion = decision.next().toLowerCase();
            if (decysion.equals("y")) {
                start = true;
                end = true;
            } else {
                end = false;
            }
        }
        return getMove;
    }

    public boolean isStart() {
        return start;
    }

    public boolean isEnd() {
        return end;
    }
}

