package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void testCalculations() {
        //Given

        //When
        double addResult = calculator.add(3.2, 6.8);
        double subResult = calculator.sub(4.3, 1.3);
        double mulResult = calculator.mul(4.8, 0.2);
        double divResult = calculator.div(5.4, 2);

        //Then
        assertEquals(10, addResult);
        assertEquals(3, subResult);
        assertEquals(0.96, mulResult);
        assertEquals(2.7, divResult);
    }


}
