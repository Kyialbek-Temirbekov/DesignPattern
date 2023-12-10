package org.example.creational.builder;

public class UserBuilder {
    private final User user;

    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder name(String name) {
        this.user.setName(name);
        return this;
    }
    public UserBuilder age(int age) {
        this.user.setAge(age);
        return this;
    }
    public UserBuilder email(String email) {
        this.user.setEmail(email);
        return this;
    }

    public User build() {
        return this.user;
    }
}
