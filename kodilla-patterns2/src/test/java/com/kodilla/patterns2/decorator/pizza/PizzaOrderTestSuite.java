package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrder() {
        //GIVEN
        BasicPizzaOrder theOrder = new BasicPizzaOrder();

        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();

        //THEN
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //GIVEN
        BasicPizzaOrder theOrder = new BasicPizzaOrder();

        //WHEN
        String description = theOrder.getDescription();

        //THEN
        assertEquals("Order a pizza with:", description);
    }

    @Test
    public void testOrderPizzaWithOnionAndHamGetCost() {
        //GIVEN
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionPizzaDecorator(theOrder);
        theOrder = new HamPizzaDecorator(theOrder);

        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();

        //THEN
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testOrderPizzaWithOnionAndHamGetDescription() {
        //GIVEN
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionPizzaDecorator(theOrder);
        theOrder = new HamPizzaDecorator(theOrder);

        //WHEN
        String description = theOrder.getDescription();

        //THEN
        assertEquals("Order a pizza with: onion ham", description);
    }

    @Test
    public void testOrderPizzaWithAllIgrediensAndDeliveryToHomeGetCost() {
        //GIVEN
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionPizzaDecorator(theOrder);
        theOrder = new HamPizzaDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new DeliveryToHomeDecorator(theOrder);

        //WHEN
        BigDecimal calculatedCost = theOrder.getCost();

        //THEN
        assertEquals(new BigDecimal(29), calculatedCost);
    }

    @Test
    public void testOrderPizzaWithAllIgrediensAndDeliveryToHomeGetDescription() {
        //GIVEN
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new OnionPizzaDecorator(theOrder);
        theOrder = new HamPizzaDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new DeliveryToHomeDecorator(theOrder);

        //WHEN
        String description = theOrder.getDescription();

        //THEN
        assertEquals("Order a pizza with: onion ham double cheese delivery to home", description);
    }
}