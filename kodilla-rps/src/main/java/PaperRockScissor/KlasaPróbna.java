package PaperRockScissor;

import java.util.Scanner;

class KlasaPróbna {

    Scanner decision = new Scanner(System.in);

    int koniecGry(String text) {
        int i=3;
        if (text == "x") {
            System.out.println("Czy napewno zakończyć grę? Yes=y, No=any button");
            String decysion = decision.next();
            if (decysion.equals("y")) {
                i = 0; // Kończy gre
            } else {
                i = 2; // Kontynuuje grę
            }
        } else if (text == "n") {
            System.out.println("Czy napewno chcesz zacząć grę od nowa? Yes=y, No=any button");
            String decysion = decision.next();
            if (decysion.equals("y")) {
                i = 1; // Zaczyna grę od nowa
            } else {
                i = 2; // Kontynuuje grę
            }
        }else {
            i= Integer.parseInt(text);
        }
        return i;
    }



}
