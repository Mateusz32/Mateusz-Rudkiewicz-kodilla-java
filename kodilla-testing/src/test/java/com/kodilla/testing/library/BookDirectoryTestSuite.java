package com.kodilla.testing.library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @DisplayName("6.6 JUnit + Mockito")

    @BeforeEach
    void beginOfTest() {
        System.out.println("Begin of 6.6 JUnit + Mockito");
    }

    @AfterEach
    void endOfTest() {
        System.out.println("Begin of 6.6 JUnit + Mockito");
    }

    @Test
    void testListBooksInHandsO() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listBookOfLibraryUser1;
        List<Book> listBookOfLibraryUser2;
        List<Book> listBookOfLibraryUser3;

        Map<Book, LibraryUser> Mapa = new HashMap();

        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("Secrets of Rome", "Bolek i Lolek", 2012);
        Book book6 = new Book("Secrets of Greek", "Socrates", 2000);

        LibraryUser libraryUser1 = new LibraryUser("Mateo", "Kowalski", "001");
        LibraryUser libraryUser2 = new LibraryUser("Gienek", "Kowalski", "001");
        LibraryUser libraryUser3 = new LibraryUser("Ździchu", "Kowalski", "001");

        Mapa.put(book1, libraryUser1);
        Mapa.put(book2, libraryUser1);
        Mapa.put(book3, libraryUser1);
        Mapa.put(book4, libraryUser1);
        Mapa.put(book2, libraryUser1);
        Mapa.put(book5, libraryUser1);
        Mapa.put(book6, libraryUser3);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(Mapa);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(Mapa);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(Mapa);

        // When
        listBookOfLibraryUser1 = bookLibrary.listBooksInHandsOf(libraryUser1);
        listBookOfLibraryUser2 = bookLibrary.listBooksInHandsOf(libraryUser2);
        listBookOfLibraryUser3 = bookLibrary.listBooksInHandsOf(libraryUser3);

        // Then
        assertEquals(5, listBookOfLibraryUser1.size());
        assertEquals(0, listBookOfLibraryUser2.size());
        assertEquals(1, listBookOfLibraryUser3.size());
    }

}

