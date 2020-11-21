package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.jupiter.api.Test;
import world.Continent;
import world.Country;
import world.World;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Give
        List<Country> europa = new ArrayList<>();;

        europa.add(new Country("Polad", new BigDecimal("38000000")));
        europa.add(new Country("Germany", new BigDecimal("60000000")));
        europa.add(new Country("Czech Republic", new BigDecimal("5000000")));

        List<Country> asia = new ArrayList<>();
        asia.add(new Country("Japan", new BigDecimal("128000000")));
        asia.add(new Country("China", new BigDecimal("120000000")));
        asia.add(new Country("India", new BigDecimal("110000000")));

        List<Country> africa = new ArrayList<>();
        africa.add(new Country("Ghana", new BigDecimal("29000000")));
        africa.add(new Country("RPA", new BigDecimal("58000000")));
        africa.add(new Country("Cameroon", new BigDecimal("25000000")));

        List<Continent> world = new ArrayList<>();
        world.add(new Continent(europa));
        world.add(new Continent(asia));
        world.add(new Continent(africa));

        //When
        BigDecimal totalPopulation = world.stream()
                .flatMap(Continent -> Continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeople = new BigDecimal("573000000");
        assertEquals(expectedPeople, totalPopulation);


    }


}
