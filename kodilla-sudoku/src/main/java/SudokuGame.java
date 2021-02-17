import java.util.List;

public class SudokuGame {

    public static void main(String[] args) {
        boolean gameFinished = false;
        Board board = Board.getInstance();
        NewUserValues newUserValues = new NewUserValues(0, 0, 0);
        List<List> boardGame = board.getRealBoard();

        System.out.println(boardGame.get(0).size());

        while (!gameFinished) {
//
//        List<Coordinate> boardGame = board.getEmptyBoard();
//        board.showBoard(boardGame);
//

//
//            board.setDigitOnBoard(newUserValues, boardGame);
//            board.showBoard(boardGame);
//        }

//        boardGame = board.resolvedSudoku(boardGame);
//        board.showBoard(boardGame);

            board.showRealBoard(boardGame);
            newUserValues.setNewUserValues();
            board.setRealUserValueToTheBoard(newUserValues, boardGame);
        }
    }
}
