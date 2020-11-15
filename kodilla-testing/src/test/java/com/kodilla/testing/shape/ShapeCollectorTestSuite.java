package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test for List of shapes")
    class ListOfShapes {
        @Test
        void testAddFigure() {
            //Given
            List<Shape> theListOfShape = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector(theListOfShape);
            Shape circle = new Circle("Circle", "10m^2");

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, theListOfShape.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            List<Shape> theListOfShape = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector(theListOfShape);
            Shape circle = new Circle("Circle", "10m^2");
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0, theListOfShape.size());
        }
    }

    @Nested
    @DisplayName("Test for getting shapes from the list")
    class GettingShapes {
        @Test
        void testGetFigure() {
            //Given
            List<Shape> theListOfShape = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector(theListOfShape);
            Shape circle = new Circle("Circle", "10m^2");
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals("Circle", shapeCollector.getFigure(0));
        }

        @Test
        void testShowFigures() {
            //Given
            List<Shape> theListOfShape = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector(theListOfShape);
            Shape circle = new Circle("Circle", "10m^2");
            Shape square = new Square("Square", "20m^2");
            Shape traingle = new Traingle("Traingle", "30m^2");
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(traingle);

            //When
            shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Circle Square Traingle ", shapeCollector.showFigures());
        }
    }
}


