package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWorkTestSuite {

    @Test
    public void testUpdate() {
        //GIVEN
        KodillaUser eugeniuszGeniusz = new KodillaUser("Eugeniusz Geniusz");
        KodillaUser ankaWeganka = new KodillaUser("Anka Weganka");
        KodillaUser tadekNiejadek = new KodillaUser("Tadek Niejadek");
        KodillaUser adamNieprzekładam = new KodillaUser("Adam Nieprzekładam");

        Mentor janNowak = new Mentor("Jan Nowak");
        Mentor marcinKowalski = new Mentor("Marcin Kowalski");

        eugeniuszGeniusz.registerObserver(janNowak);
        ankaWeganka.registerObserver(janNowak);
        tadekNiejadek.registerObserver(marcinKowalski);
        adamNieprzekładam.registerObserver(marcinKowalski);

        //WHEN
        eugeniuszGeniusz.addHomework("Moduł 1");
        eugeniuszGeniusz.addHomework("Moduł 2");
        eugeniuszGeniusz.addHomework("Moduł 3");
        eugeniuszGeniusz.addHomework("Moduł 4");

        ankaWeganka.addHomework("Moduł 1");
        ankaWeganka.addHomework("Moduł 2");

        tadekNiejadek.addHomework("Moduł 1");
        tadekNiejadek.addHomework("Moduł 3");
        tadekNiejadek.addHomework("Moduł 5");

        adamNieprzekładam.addHomework("Moduł 1");

        //THEN
        assertEquals(6, janNowak.getUpdateCount());
        assertEquals(4, marcinKowalski.getUpdateCount());
    }
}