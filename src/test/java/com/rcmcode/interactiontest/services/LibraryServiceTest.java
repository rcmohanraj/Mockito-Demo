package com.rcmcode.interactiontest.services;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class LibraryServiceTest {

    @Test
    void testBookWithIdMethod() {
        //DAO class mocked here
        final LibraryService.DAO dao = Mockito.mock(LibraryService.DAO.class);
        final LibraryService service = new LibraryService(dao);

        service.hasBookWithId(1);

        Mockito.verify(dao).fetchBookById(ArgumentMatchers.anyInt());

        //If the method is not called then we will get error. Enable this to get the failed testcase
        //Mockito.verify(dao).fetchBookByTitle(ArgumentMatchers.anyString());
    }
}