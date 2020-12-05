package PaperRockScissor;

import java.util.Random;

public class Computer {

    // Class contain computer moves

    Random generated = new Random();

    public int moveOFComputer() {
        int moveComputer = generated.nextInt(3) + 1;
        return moveComputer;
    }
}
