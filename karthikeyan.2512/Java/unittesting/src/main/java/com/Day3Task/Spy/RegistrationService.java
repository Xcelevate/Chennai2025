package com.Day3Task.Spy;

public class RegistrationService {
    private final UserRepository repo;
    RegistrationService(UserRepository r) {
        this.repo = r;
    }

    public void register(String username) {
        if (username == null) {
            throw new IllegalArgumentException();
        }
        repo.save(username.trim());
    }
}