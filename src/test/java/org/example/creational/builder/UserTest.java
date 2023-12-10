package org.example.creational.builder;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void testBuilder() {
        User user = User.builder()
                .name("Asan")
                .age(24)
                .email("asan@gmail.com")
                .build();
        System.out.println(user);

        User user1 = User.builder()
                .age(1)
                .build();
        System.out.println(user1);
    }
}