package PaperRockScissor;

class CountingPoints {

    // Class caounting points of player & computer

    private Computer computer = new Computer();
    private int lost;
    private int win;
    private boolean start1;
    private boolean start2;
    private boolean start3;

    public CountingPoints(boolean start1, boolean start2, boolean start3) {
        this.start1 = start1;
        this.start2 = start2;
        this.start3 = start3;
    }

    public CountingPoints countingPoints(Player player, String playerMovie, CountingPoints countingPoints) {
        int COM = computer.moveOFComputer();
        int MEN = Integer.parseInt(playerMovie);
        if (MEN == COM) {
            System.out.println("Draw!!!");
            if (MEN == 1) {
                System.out.println(player.getName() + ": Rock");
                System.out.println("Computer: Rock");
            } else if (MEN == 2) {
                System.out.println(player.getName() + ": Paper");
                System.out.println("Computer: Paper");
            } else if (MEN == 3) {
                System.out.println(player.getName() + ": Scissors");
                System.out.println("Computer: Scissors");
            }
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 1 && COM == 2) {
            lost++;
            System.out.println(player.getName() + ": Rock");
            System.out.println("Computer: Paper");
            System.out.println(player.getName() + " lost");
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 1 && COM == 3) {
            win++;
            System.out.println(player.getName() + ": Rock");
            System.out.println("Computer: Scissors");
            System.out.println(player.getName() + " win");
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 2 && COM == 1) {
            win++;
            System.out.println(player.getName() + ": Paper");
            System.out.println("Computer: Rock");
            System.out.println(player.getName() + " win");
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 2 && COM == 3) {
            lost++;
            System.out.println(player.getName() + ": Paper");
            System.out.println("Computer: Scissors");
            System.out.println(player.getName() + " lost");
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 3 && COM == 1) {
            lost++;
            System.out.println(player.getName() + ": Scissors");
            System.out.println("Computer: Paper");
            System.out.println(player.getName() + " lost");
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 3 && COM == 2) {
            win++;
            System.out.println(player.getName() + ": Scissros");
            System.out.println("Computer: Paper");
            System.out.println(player.getName() + " win");
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        }
        if (win == player.getNumberOfRounds() || lost == player.getNumberOfRounds()) {
            if (win == player.getNumberOfRounds()) {
                System.out.println(" You win!!! You are the best");
            } else {
                System.out.println("You lost :( I so sorry");
            }
            start1 = false;
            start2 = false;
            start3 = false;
        }
        return countingPoints;
    }

    public int getLost() {
        return lost;
    }

    public int getWin() {
        return win;
    }

    public boolean isStart1() {
        return start1;
    }

    public boolean isStart2() {
        return start2;
    }

    public boolean isStart3() {
        return start3;
    }
}


