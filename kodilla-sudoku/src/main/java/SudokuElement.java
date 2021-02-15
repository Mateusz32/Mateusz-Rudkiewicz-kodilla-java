import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    int value;

    public SudokuElement(int value) {
        this.value = value;
    }

    public List getPossibleValueSudokuElement() {
        ArrayList<Integer> possibleValue = new ArrayList<>();
        possibleValue.add(1);
        possibleValue.add(2);
        possibleValue.add(3);
        possibleValue.add(4);
        possibleValue.add(5);
        possibleValue.add(6);
        possibleValue.add(7);
        possibleValue.add(8);
        possibleValue.add(9);
        return possibleValue;
    }


}
