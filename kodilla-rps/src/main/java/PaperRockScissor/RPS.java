package PaperRockScissor;

public class RPS {
    public static void main(String[] args) {
        Player player = new Player();
        ControlOfGame controlOfGame = new ControlOfGame();
        GetMove getMove = new GetMove();
        int lost = 0;
        int win = 0;
        CountingPoints countingPoints = new CountingPoints(lost, win);
        boolean startGame = true;
        boolean end = false;
        GetMove doFinishOrBegin = new GetMove(startGame, end);

        while (startGame) {

            // What is Your name?
            player.askName();
            // How many round would You like to play??
            player.askNumberOfRounds();

            // Display about control of game
            controlOfGame.controlOfGame();
            end = false;

            while (!end) {
                // Move of Player
                String playerMove = getMove.playerMove();

                // Tutaj jest analiza czy zakończyc gre czy zaczać od nowa
                // jak się wciśnie x lub n
                doFinishOrBegin.doFinishOrBegin(doFinishOrBegin, playerMove);
                startGame = doFinishOrBegin.isStart();
                end = doFinishOrBegin.isEnd();


                //Player & computer points collect
                countingPoints.countingPoints(player, playerMove, countingPoints);
                if (win == player.getNumberOfRounds() || lost == player.getNumberOfRounds()) {
                    end = true;
                    startGame = false;
                    System.out.println(win);
                    System.out.println(lost);
                }
            }
        }
    }
}


