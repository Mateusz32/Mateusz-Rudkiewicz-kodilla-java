import java.util.ArrayList;

public class SudokuRow {
    public static int EMPTY = -1;
    SudokuElement element1 = new SudokuElement(EMPTY);
    SudokuElement element2 = new SudokuElement(EMPTY);
    SudokuElement element3 = new SudokuElement(EMPTY);
    SudokuElement element4 = new SudokuElement(EMPTY);
    SudokuElement element5 = new SudokuElement(EMPTY);
    SudokuElement element6 = new SudokuElement(EMPTY);
    SudokuElement element7 = new SudokuElement(EMPTY);
    SudokuElement element8 = new SudokuElement(EMPTY);
    SudokuElement element9 = new SudokuElement(EMPTY);

    public SudokuRow(){
        ArrayList<SudokuElement> row = new ArrayList<>();
        row.add(element1);
        row.add(element2);
        row.add(element3);
        row.add(element4);
        row.add(element5);
        row.add(element6);
        row.add(element7);
        row.add(element8);
        row.add(element9);
    }

    public static int getEMPTY() {
        return EMPTY;
    }
}
