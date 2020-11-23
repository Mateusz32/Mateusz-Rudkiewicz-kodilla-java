import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String nameUser = sc.next();
        GameUser gameuser = new GameUser(nameUser);
        Game game = new Game(gameuser);

        System.out.println();

        game.gameControl();
        System.out.println();

        game.gameRules();
    }
}
