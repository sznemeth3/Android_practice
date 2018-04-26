package com.example.openlibandroid.model;

import java.util.List;

public class JokeList {
    private Integer total;
    private List<Joke> result;

    public JokeList() {
    }

    public JokeList(Integer total, List<Joke> result) {
        this.total = total;
        this.result = result;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Joke> getResult() {
        return result;
    }

    public void setResult(List<Joke> result) {
        this.result = result;
    }
}
