package PaperRockScissor;

import java.util.Random;

public class Computer {

    Random generated = new Random();

    int moveOFComputer() {
        int moveComputer = generated.nextInt(3) + 1;
        return moveComputer;
    }
}
