package com.Day3Task.Mockito;

public class SearchService {
    private final Reporter reporter;
    SearchService(Reporter r) {
        this.reporter = r;
    }

    public void search(String term) {
        reporter.send("search:" + term);
    }
}