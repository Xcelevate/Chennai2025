package com.Day3Task.Mockito;

public class Flow {
    private final Steps steps;
    public Flow(Steps s) { this.steps = s; }
    public void run() { steps.step1(); steps.step2(); }
}
