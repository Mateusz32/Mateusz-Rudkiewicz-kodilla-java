import java.util.ArrayList;

public class SudokuBoard {
    SudokuRow row1 = new SudokuRow();
    SudokuRow row2 = new SudokuRow();
    SudokuRow row3 = new SudokuRow();
    SudokuRow row4 = new SudokuRow();
    SudokuRow row5 = new SudokuRow();
    SudokuRow row6 = new SudokuRow();
    SudokuRow row7 = new SudokuRow();
    SudokuRow row8 = new SudokuRow();
    SudokuRow row9 = new SudokuRow();



//    String boardsudoku[][] = {
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//            {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"},
//    };


    public SudokuRow getRow1() {
        return row1;
    }

    public SudokuRow getRow2() {
        return row2;
    }

    public SudokuRow getRow3() {
        return row3;
    }

    public SudokuRow getRow4() {
        return row4;
    }

    public SudokuRow getRow5() {
        return row5;
    }

    public SudokuRow getRow6() {
        return row6;
    }

    public SudokuRow getRow7() {
        return row7;
    }

    public SudokuRow getRow8() {
        return row8;
    }

    public SudokuRow getRow9() {
        return row9;
    }

    @Override
    public String toString() {
        return "SudokuBoard{" +
                "row1=" + row1 +
                ", row2=" + row2 +
                ", row3=" + row3 +
                ", row4=" + row4 +
                ", row5=" + row5 +
                ", row6=" + row6 +
                ", row7=" + row7 +
                ", row8=" + row8 +
                ", row9=" + row9 +
                '}';
    }
}

