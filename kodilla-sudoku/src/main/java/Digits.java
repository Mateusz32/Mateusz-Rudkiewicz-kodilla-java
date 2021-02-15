import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> digits;

    public Digits() {
        digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);
        digits.add(5);
        digits.add(6);
        digits.add(7);
        digits.add(8);
        digits.add(9);
    }

    boolean isCorrectDigit(int digit) {
        return digits.contains(digit);
    }

    public List<Integer> getDigits() {
        return digits;
    }
}


