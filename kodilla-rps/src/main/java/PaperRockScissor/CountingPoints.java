package PaperRockScissor;

class CountingPoints {
    Computer computer = new Computer();
    int lost;
    int win;

    CountingPoints(int lost, int win) {
        this.lost = lost;
        this.win = win;
    }

    CountingPoints countingPoints(Player player, String playerMovie, CountingPoints countingPoints) {
        int COM = computer.moveOFComputer();
        int MEN = Integer.parseInt(playerMovie);

        if (MEN == COM) {
            System.out.println("Draw!!!");
            System.out.println(COM);
            System.out.println(MEN);
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 1 && COM == 2) {
            lost++;
            System.out.println(player.getName() + " lost");
            System.out.println(COM);
            System.out.println(MEN);
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 1 && COM == 3) {
            win++;
            System.out.println(player.getName() + " win");
            System.out.println(COM);
            System.out.println(MEN);
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 2 && COM == 1) {
            win++;
            System.out.println(player.getName() + " win");
            System.out.println(COM);
            System.out.println(MEN);
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 2 && COM == 3) {
            lost++;
            System.out.println(player.getName() + " lost");
            System.out.println(COM);
            System.out.println(MEN);
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 3 && COM == 1) {
            lost++;
            System.out.println(player.getName() + " lost");
            System.out.println(COM);
            System.out.println(MEN);
            System.out.println(player.getName() + " " + win + ":" + lost + " Computer");
        } else if (MEN == 3 && COM == 2) {
            win++;
            System.out.println(player.getName() + " win");
            System.out.println(COM);
            System.out.println(MEN);
            System.out.println(player.getName() + " " + win + ":" + lost + "Computer");
        }
        return countingPoints;
    }

    public int getLost() {
        return lost;
    }

    public int getWin() {
        return win;
    }
}

