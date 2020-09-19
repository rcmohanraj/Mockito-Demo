package com.rcmcode.interactiontest.dao;

import com.rcmcode.interactiontest.Utils;
import com.rcmcode.interactiontest.model.Book;
import com.rcmcode.interactiontest.model.Topic;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class BookDAO {

    public static Path DEFAULT_PATH = Paths.get("src/main/resources/books.csv");
    private List<Book> library;
    private final Utils utils = new Utils();

    public List<Book> getSortedComputingBooksByTitle() {
        return library.stream()
                .filter(b -> b.getTopic() == Topic.COMPUTING)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    public Map<Topic, List<Book>> booksByTopic() {
        return library.stream()
                .collect(Collectors.groupingBy(Book::getTopic));
    }

    public Map<Topic, Long> bookCountByTopic() {
        return library.stream()
                .collect(Collectors.groupingBy(Book::getTopic, Collectors.counting()));
    }

    public Optional<Topic> mostPopularTopic() {
        return library.stream()
                .collect(Collectors.groupingBy(Book::getTopic, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    private void parseLibraryFrom(Path path) {
        this.library = utils.parseBookLibraryFrom(path);
    }

    /*public List<Book> getLibrary() {
        return Collections.unmodifiableList(library);
    }*/

    public static void main(String[] args) {
        final BookDAO bookDAO = new BookDAO();
        bookDAO.parseLibraryFrom(DEFAULT_PATH);
    }

    public List<String> getBookTitles() {
        return library.stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }
}
