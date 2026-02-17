package com.Day3Task.Mockito;

public class QueueService {
    private final QueueReader reader;
    QueueService(QueueReader r) { this.reader = r; }
    public String readTwice() { return reader.read() + "|" + reader.read(); }
}