package PaperRockScissor;

import java.util.Scanner;

public class GetMove {

    // Class contain moves of player

    private String playerMove;
    private boolean start1;
    private boolean start2;
    private boolean start3;
    Scanner puntMove = new Scanner(System.in);
    Moves move = new Moves();
    Scanner decision = new Scanner(System.in);

    public GetMove() {
    }

    public GetMove(boolean start1, boolean start2, boolean start3) {
        this.start1 = start1;
        this.start2 = start2;
        this.start3 = start3;
    }

   public String playerMove() {
        boolean start = true;
        while (start) {
            System.out.println("Make a move: 1-,2-,3-,x,n");
            playerMove = puntMove.next();
            if (move.isCorrectMove(playerMove)) {
                start = false;
            } else {
                System.out.print("Inncorect value!!! ");
                start = true;
            }
        }
        return playerMove;
    }

   public GetMove doFinishOrBegin(GetMove getMove, String playerMove) {
        if (playerMove.equals("x")) {
            System.out.println("Do You want to leave the game? Yes=y, No=any button");
            String decysion = decision.next().toLowerCase();
            if (decysion.equals("y")) {
                start1 = false;
                start2 = false;
                start3 = false;
            } else {
                start2 = true;
                start3 = false;
            }
        } else if (playerMove.equals("n")) {
            System.out.println("Do You want restart the game? Yes=y, No=any button");
            String decysion = decision.next().toLowerCase();
            if (decysion.equals("y")) {
                start1 = true;
                start2 = false;
                start3 = false;

            } else {
                start2 = true;
                start3 = false;
            }
        }
        return getMove;
    }

    public boolean isStart2() {
        return start2;
    }

    public boolean isStart3() {
        return start3;
    }

    public boolean isStart1() {
        return start1;
    }

}

