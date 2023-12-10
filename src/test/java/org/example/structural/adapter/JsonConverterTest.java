package org.example.structural.adapter;

import junit.framework.TestCase;
import org.example.creational.builder.User;


public class JsonConverterTest extends TestCase {

    public void testConvertToJson() throws IllegalAccessException {
        User user = User.builder()
                .name("Asan")
                .email("asn@rett.gi")
                .age(44)
                .build();
        User user1 = User.builder().name("Uson").build();
        System.out.println(JsonConverter.convertToJson(new User[]{user1, user}));
    }
}