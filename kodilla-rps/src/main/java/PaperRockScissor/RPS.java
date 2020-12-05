package PaperRockScissor;

public class RPS {
    public static void main(String[] args) {

        boolean start1 = true;
        boolean start2 = true;
        boolean start3 = true;
        CountingPoints countingPoints = new CountingPoints(start1, start2, start3);
        GetMove doFinishOrBegin = new GetMove(start1, start2, start3);

        while (start1) {
            // What is Your name?
            Player player = new Player();
            player.askName();
            // How many round would You like to play??
            player.askNumberOfRounds();
            // Display about control of game
            ControlOfGame controlOfGame = new ControlOfGame();
            controlOfGame.controlOfGame();
            start2 = true;

            while (start2) {
                start3 = true;
                // Move of Player
                GetMove getMove = new GetMove();
                String playerMove = getMove.playerMove();
                // Finish or start game on the begining
                if (playerMove.equals("x") || playerMove.equals("n")) {
                    doFinishOrBegin.doFinishOrBegin(doFinishOrBegin, playerMove);
                    start1 = doFinishOrBegin.isStart1();
                    start2 = doFinishOrBegin.isStart2();
                    start3 = doFinishOrBegin.isStart3();
                }

                while (start3) {
                    //Player & computer points collect
                    countingPoints.countingPoints(player, playerMove, countingPoints);
                    start3 = false;
                    if (countingPoints.getLost() == player.getNumberOfRounds() || countingPoints.getWin() == player.getNumberOfRounds()) {
                        start1 = countingPoints.isStart1();
                        start2 = countingPoints.isStart2();
                    }
                }
            }
        }
    }
}



