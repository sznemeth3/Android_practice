package com.example.openlibandroid.model;

import java.util.List;

public class BookList {
    private Integer start;
    private Integer num_found;
    private Integer numFound;
    private List<Book> docs;

    public BookList() {
    }

    public BookList(Integer start, Integer num_found, Integer numFound, List<Book> docs) {
        this.start = start;
        this.num_found = num_found;
        this.numFound = numFound;
        this.docs = docs;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getNum_found() {
        return num_found;
    }

    public void setNum_found(Integer num_found) {
        this.num_found = num_found;
    }

    public Integer getNumFound() {
        return numFound;
    }

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public List<Book> getDocs() {
        return docs;
    }

    public void setDocs(List<Book> docs) {
        this.docs = docs;
    }
}
