package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.example.task1.Gender;

@Getter
@AllArgsConstructor
public class Client {
    @Generated
    private final int id;
    @Setter
    private String name;
    @Setter
    private int age;
    @Setter
    private Gender sex;
    @Setter
    private String email;
}
