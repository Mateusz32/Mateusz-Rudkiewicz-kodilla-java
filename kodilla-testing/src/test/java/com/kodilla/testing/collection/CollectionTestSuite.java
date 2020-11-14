package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    String [] listOfTest = new String[]{"Test 1","Test 2"};

    List list1= Arrays.asList(listOfTest);

    @DisplayName("Check empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        System.out.println(list1.get(0));

        //Given
        List<Integer> number = new ArrayList<>();
        number.add(0, 2);
        number.add(1, 4);
        number.add(2, 6);
        number.add(3, 8);

        List<Integer> oddNumber = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(number, oddNumber);
        oddNumbersExterminator.exterminate(number);

        boolean result = oddNumber.isEmpty();

        //When
        boolean expectedResults = true;
        System.out.println("Testing list is empty: " + result);

        //Then
        Assertions.assertEquals(expectedResults, result);
    }


    @DisplayName("Check odd numbers in the list")

    @Test
    void testOddNumbersExterminatorNormalList() {

        System.out.println(list1.get(1));

        //Given
        List<Integer> number = new ArrayList<>();
        number.add(0, 1);
        number.add(1, 2);
        number.add(2, 3);
        number.add(3, 4);

        //When
        List<Integer> oddNumber = new ArrayList<>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(number, oddNumber);
        oddNumbersExterminator.exterminate(number);

        //Then
        Assertions.assertEquals(1, oddNumber.get(0));
        Assertions.assertEquals(3, oddNumber.get(1));
    }
}



