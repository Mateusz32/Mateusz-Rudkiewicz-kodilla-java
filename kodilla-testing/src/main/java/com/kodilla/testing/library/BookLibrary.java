package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;
    private LibraryUser libraryUser;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<>();
        Map<Book, LibraryUser> Mapa = libraryDatabase
                .listBooksInHandsOf(libraryUser);
        for (Map.Entry<Book, LibraryUser> entry : Mapa.entrySet()) {
            if (entry.getValue().getFirstname().equals(libraryUser.getFirstname())) {
                bookList.add(entry.getKey());
            }
        }
        return bookList;
    }
}


