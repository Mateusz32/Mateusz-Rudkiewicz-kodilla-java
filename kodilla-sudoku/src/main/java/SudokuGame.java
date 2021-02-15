import java.util.List;

public class SudokuGame {

    public static void main(String[] args) {
//        boolean gameFinished = false;
        Board board = Board.getInstance();
//        NewUserValues newUserValues = new NewUserValues(0, 0, 0);
//
//        while (!gameFinished) {
//
        List<Coordinate> boardGame = board.getEmptyBoard();
        board.showBoard(boardGame);
//
//            newUserValues.setNewUserValues();
//
//            board.setDigitOnBoard(newUserValues, boardGame);
//            board.showBoard(boardGame);
//        }

        boardGame = board.resolvedSudoku(boardGame);
        board.showBoard(boardGame);

    }
}
