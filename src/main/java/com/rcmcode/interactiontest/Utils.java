package com.rcmcode.interactiontest;

import com.rcmcode.interactiontest.model.Book;
import com.rcmcode.interactiontest.model.Topic;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    private static final int INVALID_CSV_FILE_TOKEN_ERROR_CODE = 1;
    private static final int MISSING_CSV_FILE_ERROR_CODE = 2;

    public List<Book> parseBookLibraryFrom(Path path) {
        List<Book> books = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                books.add(getBook(line));
            }
            System.out.println("Books:"+books);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

    public Book getBook(String line) {
        String[] booksArr = line.split(",");
        return new Book(getToken(booksArr, 0), Integer.parseInt(getToken(booksArr, 1)),
                Topic.valueOf(getToken(booksArr, 2)), Year.parse(getToken(booksArr, 3)),
                getToken(booksArr, 4));

    }

    public String getToken(String[] tokens, int index) {
        String token = tokens[index];
        if(token == null) {
            throw new IllegalArgumentException(String.format("%d | Found invalid token at index i: %d|", INVALID_CSV_FILE_TOKEN_ERROR_CODE, index));
        }
        return token.trim();
    }

    public static void main(String[] args) {
        Utils utils = new Utils();
        Path path = Paths.get("src/main/resources/books.csv");

        utils.parseBookLibraryFrom(path);
    }
}
