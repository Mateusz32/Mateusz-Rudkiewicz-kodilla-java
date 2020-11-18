package com.kodilla.testing.MojeKlasy;

import java.util.ArrayList;
import java.util.List;

public class Dziennki {

    Interfejs interfejs;

   public Dziennki(Interfejs interfejs) {
        this.interfejs = interfejs;
    }

    List<Osoba> metodaLista(){
        List<Osoba> osobaList = new ArrayList<>();
        Osoba osoba =(new Osoba("Mateusz", "Rudkiewicz"));
        osobaList.add(osoba);
        return osobaList;
    }



}
