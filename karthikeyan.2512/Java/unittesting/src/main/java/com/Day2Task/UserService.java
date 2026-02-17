package com.Day2Task;

public class UserService{

    public boolean register(String user) {
        return user != null;
    }


    public boolean login(String user) {
        return "admin".equals(user);
    }
}

