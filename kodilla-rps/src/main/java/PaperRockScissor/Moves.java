package PaperRockScissor;

import java.util.ArrayList;
import java.util.List;

public class Moves {

    // Class contain list of moves

    private List<String> moves;

    public Moves() {
        moves = new ArrayList<>();
        moves.add("1");
        moves.add("2");
        moves.add("3");
        moves.add("n");
        moves.add("x");
    }

    public List<String> getMoves() {
        return moves;
    }

    boolean isCorrectMove(String move) {
        return moves.contains(move);
    }

}
