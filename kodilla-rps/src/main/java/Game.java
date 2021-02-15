import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);
    GameUser gameUser;

    Game(GameUser gameUser) {
        this.gameUser = gameUser;
    }

    void gameControl() {
        System.out.println("Sterowanie grą:\n" +
                "klawisz 1 – zagranie \"kamień\",\n" +
                "klawisz 2 – zagranie \"papier\",\n" +
                "klawisz 3 – zagranie \"nożyce\",\n" +
                "klawisz x – zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" +
                "klawisz n – uruchomienie gry od nowa, poprzedzone pytaniem \"Czy na pewno zakończyć ");
    }
    void gameRules() {
        boolean end = false;

        while (!end) {
            int wygrana = 0;
            int przegrana = 0;
            System.out.println("Do ilu wygranych chcesz grać? : ");
            int round = sc.nextInt();

            boolean start = true;

            while (start) {

                System.out.println();
                System.out.println("Wykonaj ruch:1- kamień, 2- papier, 3-nożyce");
                int ruch = sc.nextInt();
                System.out.println("Mój ruch " + ruch);

                Random generator = new Random();
                int comp = generator.nextInt(3) + 1;
                System.out.println("Komp ruch " + comp);

                if (ruch == comp) {
                    System.out.println("Remis");
                    System.out.println(gameUser.getName() + " " + wygrana + ":" + przegrana + " Komputer");
                } else if (ruch == 1 && comp == 2) {
                    przegrana++;
                    System.out.println(gameUser.getName() + " przegrałeś");
                    System.out.println(gameUser.getName() + " " + wygrana + ":" + przegrana + " Komputer");
                } else if (ruch == 1 && comp == 3) {
                    wygrana++;
                    System.out.println(gameUser.getName() + " wygrałeś");
                    System.out.println(gameUser.getName() + " " + wygrana + ":" + przegrana + " Komputer");
                } else if (ruch == 2 && comp == 1) {
                    wygrana++;
                    System.out.println(gameUser.getName() + " wygrałeś");
                    System.out.println(gameUser.getName() + " " + wygrana + ":" + przegrana + " Komputer");
                } else if (ruch == 2 && comp == 3) {
                    przegrana++;
                    System.out.println(gameUser.getName() + " przegrałeś");
                    System.out.println(gameUser.getName() + " " + wygrana + ":" + przegrana + " Komputer");
                } else if (ruch == 3 && comp == 1) {
                    przegrana++;
                    System.out.println(gameUser.getName() + " przegrałeś");
                    System.out.println(gameUser.getName() + " " + wygrana + ":" + przegrana + " Komputer");
                } else if (ruch == 3 && comp == 2) {
                    wygrana++;
                    System.out.println(gameUser.getName() + " wygrałeś");
                    System.out.println(gameUser.getName() + " " + wygrana + ":" + przegrana + "Komputer");
                }

                if (wygrana == round || przegrana == round) {
                    if (wygrana > przegrana) {
                        System.out.println();
                        System.out.println(gameUser.getName() + " wygrałeś!!! :)");
                        System.out.println("Wynik końcowy " + wygrana + ":" + przegrana + " dla " + gameUser.getName());
                    }
                    if (wygrana < przegrana) {
                        System.out.println();
                        System.out.println(gameUser.getName() + " przegrałeś!!! :(");
                        System.out.println("Wynik końcowy " + wygrana + ":" + przegrana + " dla Komputera");
                    }
                    System.out.println();
                    System.out.println("Czy chcesz zagrać ponownie n=YES/x =NO?");
                    String answer = sc.next().toUpperCase();
                    if (answer.equals("N")) {
                        start = false;
                    } else if (answer.equals("X")) {
                        System.out.println("Koniec gry");
                        end = true;
                        start = false;
                    } else {
                        System.out.println("Koniec gry");
                        end = true;
                        start = false;
                    }
                }
            }
        }
    }
}


