package org.example.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void user() {
        User user = User.builder()
                .name("Alex Mytnyk")
                .height(1.78)
                .gender(Gender.MALE)
                .age(18)
                .weight(75).build();

        assertEquals(user.getWeight(), 75);
        assertEquals(user.getGender(), Gender.MALE);
        assertEquals(user.getAge(), 18);
        assertEquals(user.getName(), "Alex Mytnyk");
        assertEquals(user.getHeight(), 1.78);
    }
}
