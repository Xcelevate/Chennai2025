package com.Day3Task.Mockito;

public class NotificationService {
    private final EmailSender sender;


    NotificationService(EmailSender s) {
        this.sender = s;
    }

    public boolean notifyUser(String to) {
        return sender.send(to, "Welcome");
    }
}
