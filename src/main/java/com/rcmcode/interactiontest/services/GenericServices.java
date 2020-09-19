package com.rcmcode.interactiontest.services;

import com.rcmcode.interactiontest.model.Book;

public class GenericServices {

    private LibraryService.DAO dao;
    private LoggerService outLogger;
    private LoggerService errLogger;


    public Book fetchBookById(Integer id) {
        System.out.println("GenericService.foo");

        final Book book = dao.fetchBookById(id);
        outLogger.logToOut(book.getTitle());
        errLogger.logToErr(book.getTitle());
        return book;
    }

    public Book fetchBook(Integer id, String title) {
        System.out.println("GenericService.fetchBook");

        Book book = dao.fetchBookById(id);
        if (book==null) {
            book = dao.fetchBookByTitle(title);
        }
        outLogger.logToOut(book.getTitle());
        errLogger.logToErr(book.getTitle());
        return book;
    }
}
