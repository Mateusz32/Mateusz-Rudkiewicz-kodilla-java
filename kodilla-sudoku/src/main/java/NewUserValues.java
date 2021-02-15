import java.util.InputMismatchException;
import java.util.Scanner;

public class NewUserValues {

    int row;
    int col;
    int value;
    Scanner scanner = new Scanner(System.in);
    Digits digits = new Digits();

    public NewUserValues(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public NewUserValues setNewUserValues() {
        boolean start = true;
        while (start) {
            System.out.println("Put row index: ");
            try {
                this.row = scanner.nextInt();
                System.out.println("Put column index: ");
                this.col = scanner.nextInt();
                System.out.println("Put value: ");
                this.value = scanner.nextInt();
                start = false;
            } catch (InputMismatchException e) {
                System.out.println("Put value from 1 to 9 !!!");
                scanner = new Scanner(System.in);
            }
            if (digits.isCorrectDigit(row) == false ||
                    digits.isCorrectDigit(col) == false ||
                    digits.isCorrectDigit(value) == false) {
                System.out.println("Incorrect row, column or value. Put value range from 1 to 9");
                start = true;
            }
        }
        return new NewUserValues(row, col, value);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getValue() {
        return value;
    }
}
