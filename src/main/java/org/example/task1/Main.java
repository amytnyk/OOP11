package org.example.task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Alex Mytnyk")
                .height(1.78)
                .gender(Gender.MALE)
                .age(18)
                .weight(75).build();
        System.out.println(user);
    }
}
