import java.util.ArrayList;
import java.util.List;

public class Board {

    public List<Coordinate> board = new ArrayList<>();
    protected static Board boardInstance;

    public List<Coordinate> getBoard() {
        return board;
    }

    public static Board getInstance() {
        if (boardInstance == null) {
            boardInstance = new Board();
        }
        return boardInstance;
    }

    public List<Coordinate> getEmptyBoard() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                board.add(new Coordinate(i, j, 0));
            }
        }
        board.remove(1);
        board.add(1, new Coordinate(1, 2, 2));
        board.remove(3);
        board.add(3, new Coordinate(1, 4, 5));
        board.remove(5);
        board.add(5, new Coordinate(1, 6, 1));
        board.remove(7);
        board.add(7, new Coordinate(1, 8, 9));
        return board;
    }

    public void showBoard(List<Coordinate> board) {
        int k = -1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                k++;
                if (j == 9) {
                    System.out.print("|" + board.get(k).getValue() + "|");
                } else {
                    System.out.print("|" + board.get(k).getValue());
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public List<Coordinate> setDigitOnBoard(NewUserValues newUserValues, List<Coordinate> board) {
        int row = newUserValues.getRow();
        int col = newUserValues.getCol();
        int value = newUserValues.getValue();
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).getRow() == row) {
                if (board.get(i).getCol() == col) {
                    board.get(i).setValue(value);
                }
            }
        }
        return board;
    }

    public List<Coordinate> resolvedSudoku(List<Coordinate> board) {

        for (int i = 0; i < 10; i++) {
            Digits digits = new Digits();
            List<Integer> rowDigits = digits.getDigits();

            for (int j = 1; j < 10; j++) {

//                for (Coordinate boards : board) {
//                    int row = boards.getRow();
//                    int col = boards.getCol();
//                    int value = boards.getValue();
//                    if (row == i && col == j && value != 0) {
//                        int digitToRemove = boards.getValue();
//                        int indexToRemove = rowDigits.indexOf(digitToRemove);
//                        rowDigits.remove(indexToRemove);
//                        System.out.println("cyfryku"+rowDigits.size());
//                    }
//                }

                for (Coordinate boards : board) {
                    System.out.println("Cyfry"+rowDigits.size());
                    int row = boards.getRow();
                    System.out.println("Row: "+row);
                    int col = boards.getCol();
                    System.out.println("Col: "+col);
                    int value = boards.getValue();
                    System.out.println("Value: "+value);
                    int newValue = rowDigits.get(0);
                    System.out.println("Pierwszy z listy "+rowDigits.get(0));
                    rowDigits.remove(0);
                    System.out.println("Rozmiar "+rowDigits.size());
                    if(rowDigits.size()==0) {

                        rowDigits.add(1);
                        rowDigits.add(2);
                        rowDigits.add(3);
                        rowDigits.add(4);
                        rowDigits.add(5);
                        rowDigits.add(6);
                        rowDigits.add(7);
                        rowDigits.add(8);
                        rowDigits.add(9);
                    }
                    if (row == i && col == j && value == 0) {
                        boards.setValue(newValue);
                        System.out.println(board.get(0));

                        }

                    }







                }

            }



//        for (int i = 1; i < 10; i++) {
//            Digits digits = new Digits();
//            List<Integer> rowDigits = digits.getDigits();
//            for (int j = 1; j < 10; j++) {
//                for (Coordinate boards : board) {
//                    System.out.println("Value"+boards.getValue());
//                    System.out.println("row"+boards.getRow());
//                    System.out.println(i);
//                    System.out.println("columna"+boards.getCol());
//                    System.out.println(j);
//                    System.out.println(boards.getRow() == i && boards.getCol() == j && boards.getValue() != 0);
//                    if (boards.getRow() == i && boards.getCol() == j && boards.getValue() != 0) {
//                        System.out.println("jestem w ifie");
//                        int digitToRemove = boards.getValue();
//                        int indexToRemove = rowDigits.indexOf(digitToRemove);
//                        rowDigits.remove(indexToRemove);
//                        System.out.println("Rozmiar digits123"+rowDigits.size());
//                    }
//                }}
//                for (int k = 0; k < 10; k++) {
//                    System.out.println("Rozmiar digits"+rowDigits.size());
//                    int newDigit = board.get(k).getValue();
//                    System.out.println("nowa cyfra"+newDigit);
//                    if (newDigit == 0) {
//                        System.out.println("Rozmiar" +board.size());
//                        System.out.println("cos"+rowDigits.get(0));
//                        board.get(k).setValue(rowDigits.get(0));
//                        rowDigits.remove(0);
//                    }
//                }
//
//            }


        return board;
    }
}

