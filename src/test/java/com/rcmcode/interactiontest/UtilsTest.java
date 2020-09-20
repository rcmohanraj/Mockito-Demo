package com.rcmcode.interactiontest;

import com.rcmcode.interactiontest.dao.BookDAO;
import com.rcmcode.interactiontest.model.Book;
import com.rcmcode.interactiontest.model.Topic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.nio.file.Path;
import java.time.Year;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UtilsTest {

    @Mock
    private Utils utils;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    /* Basic STUB method created */
    @Test
    void testStubMethod() {
        //Hard coded behavior
        List<Book> expect = Arrays.asList(new Book[] {
                new Book("Effective Java", 280,
                     Topic.COMPUTING, Year.of(2000),"Joshua Block")});

        when(utils.parseBookLibraryFrom(any(Path.class))).thenReturn(expect);

        assertThat(utils.parseBookLibraryFrom(BookDAO.DEFAULT_PATH), is(equalTo(expect)));
    }

    /* Basic STUB method created with Exception handling */
    @Test
    void testStubbingOfException() {
        //Hard coded behavior
        when(utils.getBook(any(String.class))).thenThrow(RuntimeException.class);

        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            utils.getBook("");
        });

        assertThat(exception.getClass(), is(equalTo(RuntimeException.class)));
    }
}