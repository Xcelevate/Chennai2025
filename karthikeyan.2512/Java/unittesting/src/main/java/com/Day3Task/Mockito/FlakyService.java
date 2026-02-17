package com.Day3Task.Mockito;

public class FlakyService {

    private final Processor p;

    public FlakyService(Processor p) {
        this.p = p;
    }
    public String attempt(String id) {
        return p.process(id);
    }
}
