package com.Day3Task;

public class Session {
    private boolean open = false;

    public void open() {
        open = true;
    }

    public void close() {
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
