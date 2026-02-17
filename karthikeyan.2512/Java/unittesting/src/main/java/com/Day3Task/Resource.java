package com.Day3Task;

public class Resource {
    private boolean released = false;

    public void release() {
        released = true;
    }

    public boolean isReleased() {
        return released;
    }
}
