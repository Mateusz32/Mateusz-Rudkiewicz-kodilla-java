package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(2018, 4, 4));
        Book book2 = new Book("Chłopi", "Adam Mickiewicz", LocalDate.of(2000, 11, 30));
        Book book3 = new Book("Janko muzykant", "August Poniatowski", LocalDate.of(2007, 12, 14));
        Book book4 = new Book("Szczury Wrocławia", "Eugeniusz Geniusz", LocalDate.of(1970, 7, 31));
        Book book5 = new Book("Metro 2034", "Mateusz Rudkiewicz", LocalDate.of(2020, 10, 10));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        deepClonedLibrary.getBooks().remove(book3);
        System.out.println(deepClonedLibrary.getBooks().size());

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
