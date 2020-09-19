package com.rcmcode.interactiontest.model;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class Book {

    private String title;
    private int pageCount;
    private Topic topic;
    private Year publicationDate;
    private List<String> authors;

    public Book(String title, int pageCount, Topic topic, Year publicationDate, String... authors) {
        this.title = title;
        this.pageCount = pageCount;
        this.topic = topic;
        this.publicationDate = publicationDate;
        this.authors = Arrays.asList(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Year getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Year publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", topic=" + topic +
                ", publicationDate=" + publicationDate +
                ", authors=" + authors +
                '}';
    }
}

