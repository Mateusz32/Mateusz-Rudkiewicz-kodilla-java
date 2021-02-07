package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .ingredient("Onion")
                .bun("Sesame bun")
                .sauce("Standard")
                .ingredient("Salat")
                .ingredient("Chili papers")
                .ingredient("Chease")
                .ingredient("Becon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String kindOfBun = bigmac.getBun();
        String kindOfSauce = bigmac.getSauce();

        //Then
        assertEquals(5, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertEquals("Sesame bun", kindOfBun);
        assertEquals("Standard", kindOfSauce);
    }
}
