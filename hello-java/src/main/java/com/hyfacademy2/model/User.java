package com.hyfacademy2.model;

public abstract class User {
    private String name;
    private String email;
    private String userId;

    public User(String name, String email, String userId) {
        setEmail(email.trim());
        setName(name.trim());
        setUserId(userId.trim());
    }

    public void setEmail(String email) {
        if (email == null || email.equals("")) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        // is email validation required?

        this.email = email;
    }

    public void setUserId(String userId) {
        if (userId == null || userId.trim().equals("")) {
            throw new IllegalArgumentException("invalid id");
        }
        this.userId = userId;
    }

    public void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("name cannot be empty");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    abstract String getRole();

    @Override
    public String toString() {
        return String.format("[%s] %s | %s", getRole(), name, email);
    }

    public String getSummary() {
        return toString();
    }

}
