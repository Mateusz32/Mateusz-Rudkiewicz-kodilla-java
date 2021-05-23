package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //GIVEN
        BookA book1 = new BookA("Adam Mickiewicz", "Dziady", 2000, "1234");
        BookA book2 = new BookA("Henryk Sienkiewicz", "W pustyni i w puszczy", 2001, "5678");
        BookA book3 = new BookA("Adam Smith", "Szczuty Wrocławia", 2010, "4321");
        BookA book4 = new BookA("Juliusz Słowacki", "Kordian", 1999, "8765");
        BookA book5 = new BookA("Jan Brzechwa", "Pan Kleks", 1995, "2468");

        Set<BookA> setOfBooks = new HashSet<>();
        setOfBooks.add(book1);
        setOfBooks.add(book2);
        setOfBooks.add(book3);
        setOfBooks.add(book4);
        setOfBooks.add(book5);

        //WHEN
        MedianAdapter medianAdapter = new MedianAdapter();
        int mediana = medianAdapter.publicationYearMedian(setOfBooks);

        //THEN;
        assertEquals(2000, mediana, 0);
    }
}
